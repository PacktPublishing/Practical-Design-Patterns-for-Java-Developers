final class DependencyInjectionMain {
    public static void main(String[] args) {
        System.out.println("Pattern Dependency Injection: vehicle and engine");
        EngineServiceProvider.addEngine(new FastEngine("sport"));

        Engine engine = EngineServiceProvider.getEngineByType("sport");
        Vehicle vehicle = new SportVehicle(engine);
        vehicle.move();
    }
}
