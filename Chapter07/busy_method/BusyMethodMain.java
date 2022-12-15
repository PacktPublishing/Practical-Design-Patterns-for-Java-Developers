import java.io.IOException;
import java.util.HashSet;

class BusyMethodMain {

    static final int THREADS_NUMBER = 4;
    static final int ELEMENTS_NUMBER = 1000;

    public static void main(String[] args) throws IOException {
        System.out.println("Vehicle Data Analysis Example...");
        var builder = new ThreadContainer.Builder()
                .addThreadGroup("Busy-Method-Workers");
        for (int i = 0; i < THREADS_NUMBER; i++) {
            builder.addRunnable(new VehicleAnalyticalWorker(i, ELEMENTS_NUMBER, new HashSet<>(), new HashSet<>()));
        }
        var container = builder.build();

        container.startAsDaemon();
        System.out.println("ThreadContainer started:" + container.isStarted() + ", threads:" + THREADS_NUMBER);
        System.out.println("Press any key to quit!");
        System.out.flush();
        System.in.read();
    }
}
