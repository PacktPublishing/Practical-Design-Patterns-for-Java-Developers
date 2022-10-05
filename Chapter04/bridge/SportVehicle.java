final class SportVehicle extends Vehicle{
    private final int horsePowers;

    public SportVehicle(Engine engine, int horsePowers) {
        super("sport-car", engine);
        this.horsePowers = horsePowers;
    }

    @Override
    void drive() {
        System.out.println("SportVehicle, starting engine");
        startEngine();
        System.out.println("SportVehicle, engine started, hp:" + horsePowers);
    }

    @Override
    void stop() {
        System.out.println("SportVehicle, stopping engine");
        stopEngine();
        System.out.println("SportVehicle, engine stopped");
    }
}
