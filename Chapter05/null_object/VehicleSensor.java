final class VehicleSensor extends AbstractSensor{

    VehicleSensor(String type) {
        super(type);
    }

    @Override
    boolean isAvailable() {
        return true;
    }
}
