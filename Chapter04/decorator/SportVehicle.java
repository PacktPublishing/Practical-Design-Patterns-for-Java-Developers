final class SportVehicle extends TunedVehicleDecorator {
    private final int horsePower;

    public SportVehicle(Vehicle vehicle, int horsePower) {
        super(vehicle);
        this.horsePower = horsePower;
    }

    @Override
    public void move() {
        System.out.println("SportVehicle, activate horse power:" + horsePower);
        super.move();
    }


}
