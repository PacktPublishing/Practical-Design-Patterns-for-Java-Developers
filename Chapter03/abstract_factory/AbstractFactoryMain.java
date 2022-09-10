
public class AbstractFactoryMain {
    public static void main(String[] args) {
        System.out.println("Pattern Abstract Factory: Vehicle Factory 1..."); 
        AbstractFactory carFactory = FactoryProvider.getFactory("car");
        Vehicle slowCar = carFactory.createVehicle("slow");
        slowCar.move();  
    }
    
}
