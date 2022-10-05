class BridgeMain {
    public static void main(String[] args) {
        System.out.println("Pattern Bridge, vehicle engines...");
        Vehicle sportVehicle = new SportVehicle(new PetrolEngine(), 911);
        Vehicle pickupVehicle = new PickupVehicle(new DieselEngine(), 300);

        sportVehicle.drive();
        sportVehicle.stop();

        pickupVehicle.drive();
        pickupVehicle.stop();
    }
}
