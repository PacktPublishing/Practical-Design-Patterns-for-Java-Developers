final class VehicleEngine extends AbstractVehiclePart {

    private VehicleBreaks twin;

    VehicleEngine() {
    }

    void setBreaks(VehicleBreaks breaks) {
        this.twin = breaks;
    }

    @Override
    void init() {
        if (twin.isReady()) {
            setReady();
        } else {
            setReady();
            twin.init();
        }
        System.out.println("VehicleEngine, initiated");
    }
}
