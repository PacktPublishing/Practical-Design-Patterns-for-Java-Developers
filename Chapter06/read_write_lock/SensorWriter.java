import java.util.Random;

class SensorWriter implements Runnable {
    private static final Random RANDOM = new Random();
    private final String type;
    private final Sensor sensor;

    SensorWriter(String type, Sensor sensor) {
        this.type = type;
        this.sensor = sensor;
    }

    @Override
    public void run() {
        var value = RANDOM.nextInt(10, 30);
        sensor.writeValue(value);
        ReadWriteLockUtils.delayMills(value);
        System.out.printf("""
                SensorWriter write, type:'%s', value:'%d', thread:'%s'%n""", type, value, Thread.currentThread().getName());
    }

}
