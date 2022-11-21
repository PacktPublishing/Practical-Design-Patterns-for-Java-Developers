import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

class ProdConThreadFactory implements ThreadFactory {

    private final AtomicInteger counter;
    private final String name;

    ProdConThreadFactory(String name) {
        this.counter = new AtomicInteger();
        this.name = name;
    }

    @Override
    public Thread newThread(Runnable r) {
        var t = new Thread(r);
        t.setDaemon(true);
        t.setName("""
                pool-%s-%d""".formatted(name, counter.getAndIncrement()));
        return t;
    }
}
