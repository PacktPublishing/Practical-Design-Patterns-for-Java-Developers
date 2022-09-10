class SportVehicle implements Vehicle{

    private final Engine engine;

    SportVehicle(Engine e) {
        this.engine = e;
    }

    @Override
    public void move() {
        if(!engine.isStarted()){
            engine.start();
        }
        engine.run();
        System.out.println("SportCar, move");
    }
}
