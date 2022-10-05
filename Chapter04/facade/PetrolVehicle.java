class PetrolVehicle implements Vehicle{
    @Override
    public void start() {
        System.out.println("PetrolVehicle, engine start");
    }

    @Override
    public void refuel() {
        System.out.println("PetrolVehicle, refuel petrol");
    }
}
