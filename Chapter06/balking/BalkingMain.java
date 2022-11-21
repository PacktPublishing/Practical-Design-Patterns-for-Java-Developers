import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class BalkingMain {
    public static void main(String[] args) throws Exception {
        System.out.println("Balking pattern, vehicle move");

        var vehicle = new Vehicle();
        var numberOfDrivers = 5;
        var executors = Executors.newFixedThreadPool(2);
        for (int i = 0; i < numberOfDrivers; i++) {
            executors.submit(vehicle::drive);
        }
        TimeUnit.MILLISECONDS.sleep(1000);
        executors.shutdown();
        System.out.println("Done");
    }
}
