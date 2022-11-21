import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class DoubleCheckedLockingMain {
    public static void main(String[] args) {
        System.out.println("Double checked locking pattern, only one vehicle");
        var amount = 5;
        ExecutorService executor = Executors.newFixedThreadPool(amount);
        System.out.println("Number of executors:" + amount);
        for (int i = 0; i < amount; i++) {
            executor.submit(VehicleSingleton::getInstance);
            executor.submit(VehicleSingletonChecked::getInstance);
        }
        executor.shutdown();
    }
}
