class SlowCar implements Vehicle{
    private final Part engine;
    private final Part cabin;

    SlowCar(Part engine, Part cabin){
        this.engine = engine;
        this.cabin = cabin;
    }

    @Override
    public void move() {
        System.out.println("SlowCar, move");
    }

    @Override
    public void parts() {
        System.out.println("SlowCar,engine: " + engine);
        System.out.println("SlowCar,cabin: " + cabin);
    }    
}
