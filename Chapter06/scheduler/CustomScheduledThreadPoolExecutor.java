import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class CustomScheduledThreadPoolExecutor extends ScheduledThreadPoolExecutor {

    private static final AtomicInteger COUNTER = new AtomicInteger();
    private final Map<Integer, LocalDateTime> startTimestamps = new ConcurrentHashMap<>();

    CustomScheduledThreadPoolExecutor(int corePoolSize) {
        super(corePoolSize, r -> {
            var thread = new Thread(r, "custom-scheduler-pool-"+ COUNTER.getAndIncrement());
            thread.setDaemon(true);
            return thread;
        });
    }

    @Override
    protected void beforeExecute(Thread t, Runnable r) {
        System.out.printf("""         
                POOL, before execution, thread:'%s', task:'%s'%n""", t.getName(), r.hashCode());
        startTimestamps.put(r.hashCode(), LocalDateTime.now());
    }

    @Override
    protected void afterExecute(Runnable r, Throwable t) {
        var startTime = startTimestamps.get(r.hashCode());
        var diff = ChronoUnit.MILLIS.between(startTime, LocalDateTime.now());
        System.out.printf("""         
                POOL, after execution, task:'%s', diff:'%d'%n""", r.hashCode(), diff);
    }

    @Override
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit) {
        var mills = TimeUnit.MILLISECONDS.convert(period, unit);
        ScheduledFuture<?> result = super.scheduleAtFixedRate(command, initialDelay, mills, TimeUnit.MILLISECONDS);
        System.out.printf("""
                POOL: scheduled task:'%s', every MILLS:'%d'%n""", command.hashCode(), mills);
        return result;
    }

    @Override
    public void shutdown() {
        System.out.println("POOL is going down");
        super.shutdown();
    }
}
