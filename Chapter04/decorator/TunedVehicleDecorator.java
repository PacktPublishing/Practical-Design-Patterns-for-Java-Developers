abstract class TunedVehicleDecorator implements Vehicle {
    private final Vehicle vehicle;

    TunedVehicleDecorator(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


    @Override
    public void move() {
        System.out.println("TunedVehicleDecorator, turbo on");
        vehicle.move();
    }
}
