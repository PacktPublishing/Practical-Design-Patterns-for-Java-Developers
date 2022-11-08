class ChainOfResponsibilityMain {
    public static void main(String[] args) {
        System.out.println("Pattern Chain of Responsibility, vehicle system initialisation");
        var engineSystem = new EngineSystem();
        var driverSystem = new DriverSystem();
        var transmissionSystem = new TransmissionSystem();

        driverSystem.setNext(transmissionSystem);
        transmissionSystem.setNext(engineSystem);

        driverSystem.powerOn();
    }
}
