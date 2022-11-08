class MediatorMain {
    public static void main(String[] args) {
        System.out.println("Mediator Pattern, vehicle parts");
        var engineSensor = new Sensor("engine");
        var breakSensor = new Sensor("break");

        engineSensor.emitMessage("turn on");
        breakSensor.emitMessage("init");

    }
}
