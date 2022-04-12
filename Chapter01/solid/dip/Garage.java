import java.util.ArrayList;
import java.util.List;

interface Vehicle {}
class Car implements Vehicle {}
class SportCar extends Car {}
class Truck implements Vehicle {}
class Bus implements Vehicle {} 

public class Garage {
    private List<Vehicle> parkingSpots = new ArrayList<>();
    public void park(Vehicle vehicle){
        parkingSpots.add(vehicle);
    }    
}
