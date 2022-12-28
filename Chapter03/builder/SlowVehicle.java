class SlowVehicle implements Vehicle{
    private final Part engine;
    private final Part cabin;

    SlowVehicle(Part engine, Part cabin){
        this.engine = engine;
        this.cabin = cabin;
    }

    @Override
    public void move() {
        System.out.println("SlowVehicle, move");
    }

    @Override
    public void parts() {
        System.out.println("SlowVehicle,engine: " + engine);
        System.out.println("SlowVehicle,cabin: " + cabin);
    }    
}
