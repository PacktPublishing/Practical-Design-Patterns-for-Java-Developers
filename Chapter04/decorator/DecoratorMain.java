class DecoratorMain {
    public static void main(String[] args) {
        System.out.println("Pattern Decorator, tuned vehicle");
        Vehicle standardVehicle = new StandardVehicle();
        Vehicle vehicleToBeTuned = new StandardVehicle();
        Vehicle tunedVehicle = new SportVehicle(vehicleToBeTuned, 200);

        System.out.println("Drive a standard vehicle");
        standardVehicle.move();

        System.out.println("Drive a tuned vehicle");
        tunedVehicle.move();
    }
}
