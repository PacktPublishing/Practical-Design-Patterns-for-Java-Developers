import java.util.HashMap;
import java.util.Map;

final class VehicleProvider {

    private Vehicle truck;
    private Vehicle car;

    VehicleProvider() {
    }

    Vehicle getVehicleByType(String type){
        
        switch(type){
            case "car":
                if(car == null){
                    System.out.println("lazy car created");
                    car = new LazyVehicle(type);
                
                }
                return car;
            case "truck":
                if(truck == null){
                    System.out.println("lazy truck created");
                    truck = new LazyVehicle(type);
                }
                return truck;
            default:
                throw new IllegalArgumentException("not implemented");    
        }

    }

    void printStatus(){
        System.out.println("status, truck:" + truck);
        System.out.println("status, car:" + car);
    }

}
