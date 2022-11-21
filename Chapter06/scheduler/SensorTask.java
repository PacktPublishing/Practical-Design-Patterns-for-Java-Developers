import java.util.Random;
import java.util.concurrent.TimeUnit;

class SensorTask implements Runnable {
    private final Random random;
    private final String type;
    private int activeTime;

    SensorTask(String type) {
        this.random = new Random();
        this.type = type;
    }

    int activeTime() {
        return activeTime;
    }

    @Override
    public void run() {
        activeTime = random.nextInt(50, 80);
        try {
            System.out.printf("""
                    SensorTask, type:'%s',activeTime:'%d',thread:'%s'%n""", type, activeTime, Thread.currentThread().getName());
            TimeUnit.MILLISECONDS.sleep(activeTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
