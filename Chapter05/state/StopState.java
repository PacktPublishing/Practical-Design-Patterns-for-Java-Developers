final class StopState implements VehicleState{
    private Vehicle vehicle;

    @Override
    public void onAction() {
        System.out.printf("Engine is turning off, vehicle:'%s'%n",vehicle);
    }

    @Override
    public void evaluate() {
        System.out.printf("Engine is down, vehicle:'%s'%n",vehicle);
    }

    @Override
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "StopState{" +
               "vehicle=" + vehicle.getModel() +
               '}';
    }
}
