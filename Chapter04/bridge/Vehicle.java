abstract class Vehicle {

    private final String type;
    private final Engine engine;

    protected Vehicle(String type, Engine engine) {
        this.type = type;
        this.engine = engine;
    }

    abstract void drive();

    abstract void stop();

    void startEngine(){
        engine.turnOn();
    }

    void stopEngine(){
        engine.turnOff();
    }
}
