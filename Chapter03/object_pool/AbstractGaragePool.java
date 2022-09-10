import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

abstract class AbstractGaragePool<T extends Vehicle> {
    private final Set<T> available = new HashSet<>();
    private final Set<T> inUse = new HashSet<>();

    protected abstract T buyVehicle();

    synchronized T driveVehicle() {
        if (available.isEmpty()) {
            available.add(buyVehicle());
        }
        var instance = available.iterator().next();
        available.remove(instance);
        inUse.add(instance);
        return instance;
    }

    synchronized void returnVehicle(T instance) {
        System.out.println("returned vehicle, vin:" + instance.getVin());
        inUse.remove(instance);
        available.add(instance);
    }

    void printStatus() {
        var availableVins =  available.stream().map(Vehicle::getVin).collect(Collectors.toList());
        var inUseVins =  inUse.stream().map(Vehicle::getVin).collect(Collectors.toList());
        System.out.printf("Garage Pool vehicles available=%d[%s] inUse=%d[%s]%n", 
            available.size(), availableVins, inUse.size(), inUseVins);
    }
    
}
