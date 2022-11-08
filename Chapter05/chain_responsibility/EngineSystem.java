final class EngineSystem extends VehicleSystem {

    EngineSystem() {
        super(SystemType.ENGINE);
    }

    @Override
    void activate() {
        System.out.println("EngineSystem, activated");
    }
}
