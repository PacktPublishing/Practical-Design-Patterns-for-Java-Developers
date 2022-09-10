final class FactoryMethodMain {
    public static void main(String[] args) {
        System.out.println("Pattern Factory Method: Vehicle Factory 2");   
        var sportCar = VehicleFactory.produce("sport");
        System.out.println("sport-car:" + sportCar);
        sportCar.move();
    }
}
