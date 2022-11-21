import java.util.Random;
import java.util.concurrent.TimeUnit;

final class TemperatureTask implements SensorTask{
    private static final Random RANDOM = new Random();

    private final String type;

    public TemperatureTask(String type) {
        this.type = type;
    }

    @Override
    public void measure() throws InterruptedException {
        var temperature = RANDOM.nextInt(0,42);
        TimeUnit.MILLISECONDS.sleep(temperature);
        System.out.printf("""
                TemperatureTask, type:'%s', temp:'%s', thread:'%s'%n""", type, temperature, Thread.currentThread().getName());
    }
}
