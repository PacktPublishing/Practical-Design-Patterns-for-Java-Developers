import java.util.Arrays;
import java.util.List;

class FacadeMain {
    public static void main(String[] args) {
        System.out.println("Pattern Facade, vehicle types");
        List<Vehicle> vehicles = Arrays.asList(new DieselVehicle(), new PetrolVehicle());
        for (var vehicle: vehicles){
            vehicle.start();
            vehicle.refuel();
        }
    }
}
