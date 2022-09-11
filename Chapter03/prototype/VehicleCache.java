import java.util.Map;

final class VehicleCache {
  
    private static final Map<String, Vehicle> map = Map.of("fast-car", new FastCar(), "slow-car", new SlowCar());

    private VehicleCache(){}
    static Vehicle getVehicle(String type){
        Vehicle vehicle = map.get(type);
        if(vehicle == null) throw new IllegalArgumentException("not allowed:" + type);
        return (Vehicle) vehicle.clone();
    }
}
