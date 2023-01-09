class Vehicle {
    private final Engine engine = new Engine();
    private final VehicleComputer vehicleComputer = new VehicleComputer();
    void move(){
        engine.start();
        vehicleComputer.lightsOn();
    }
    void stop(){
        engine.stop();
        vehicleComputer.lightsOff();
    }    
}
