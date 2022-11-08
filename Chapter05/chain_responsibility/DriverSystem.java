final class DriverSystem extends VehicleSystem {

    DriverSystem() {
        super(SystemType.DRIVER);
    }

    @Override
    void activate() {
        System.out.println("DriverSystem: activated");
    }
}
