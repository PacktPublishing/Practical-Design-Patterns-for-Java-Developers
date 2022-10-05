public class VehicleBreaks extends AbstractVehiclePart {

    private VehicleEngine twin;

    VehicleBreaks() {
    }

    void setEngine(VehicleEngine engine) {
        this.twin = engine;
    }

    @Override
    void init() {
        if (twin.isReady()) {
            setReady();
        } else {
            setReady();
            twin.init();
        }
        System.out.println("VehicleBreaks, initiated");
    }
}
