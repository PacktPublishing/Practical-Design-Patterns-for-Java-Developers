import java.util.ServiceLoader;

class DependencyInjectionServiceLoaderMain {
    public static void main(String[] args) {
        System.out.println("Pattern Dependency Injection Service Loader: vehicle and engine");
        ServiceLoader<Engine> engineService = ServiceLoader.load(Engine.class);
        Engine engine = engineService.findFirst().orElseThrow();
        Vehicle vehicle = new SportVehicle(engine);
        vehicle.move();
    }    
}
