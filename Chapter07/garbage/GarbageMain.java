public class GarbageMain {

    public static final int THREADS_NUMBER = 2;
    public static final int ALLOCATION_SIZE = 10_000;

    public static void main(String[] args) throws Exception {
        System.out.println("Sensor Alarm example...");
        var builder = new ThreadContainer.Builder()
                .addThreadGroup("SensorAlarm-Workers");
        for (int i = 0; i < THREADS_NUMBER; i++) {
            builder.addRunnable(new SensorAlarmWorker(i, ALLOCATION_SIZE));
        }

        var container = builder.build();
        container.startAsDaemon();
        System.out.println("Vehicle alarm system started status:" + container.isStarted() + ", threads:" + THREADS_NUMBER);
        System.out.println("Press any key to quit!");
        System.out.flush();
        System.in.read();
    }
}
