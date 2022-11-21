import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

class CustomScheduler {

    private final int intervalMills;
    private final Thread thread;
    private final ArrayBlockingQueue<SensorTask> queue;
    private boolean active;

    CustomScheduler(int intervalMillis) {
        this.intervalMills = intervalMillis;
        this.queue = new ArrayBlockingQueue<>(10);
        this.thread = new Thread(() -> {
            while (active){
                try {
                    var runnable = queue.poll(intervalMillis, TimeUnit.MILLISECONDS);
                    if(runnable != null){
                        runnable.run();
                    }
                    var delay = intervalMillis - runnable.activeTime();
                    TimeUnit.MILLISECONDS.sleep(delay);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("CustomScheduler, stopped");
        }, "scheduler-1");
    }

    void run(){
        this.active = true;
        this.thread.start();
    }

    void stop(){
        this.active = false;
    }


    void addTask(SensorTask runnable){
        try {
            queue.put(runnable);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
