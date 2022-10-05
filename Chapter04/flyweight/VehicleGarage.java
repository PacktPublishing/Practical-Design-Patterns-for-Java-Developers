import java.util.HashMap;
import java.util.Map;

class VehicleGarage {

    private static final Map<String, Vehicle> vehicleByType = new HashMap<>();
    static {
        vehicleByType.put("common", new VehicleType("common-car"));
        vehicleByType.put("sport", new VehicleType("sport-car"));
    }

    private VehicleGarage() {
    }


    static Vehicle borrow(String type){
        Vehicle v = vehicleByType.get(type);
        if(v == null){
            v = new VehicleType(type);
            vehicleByType.put(type, v);
        }
        // Return only copy, not object
        System.out.println("VehicleGarage, borrowed type:" + type);
        return v;
    }
}
