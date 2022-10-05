final class PickupVehicle extends Vehicle{
    private final int horsePowers;

    public PickupVehicle(Engine engine, int horsePowers) {
        super("pick-car", engine);
        this.horsePowers = horsePowers;
    }

    @Override
    void drive() {
        System.out.println("PickupVehicle, starting engine");
        startEngine();
        System.out.println("PickupVehicle, engine started, hp:" + horsePowers);
    }

    @Override
    void stop() {
        System.out.println("PickupVehicle, stopping engine");
        stopEngine();
        System.out.println("PickupVehicle, engine stopped");
    }
}
