class StartState implements VehicleState{
    private Vehicle vehicle;

    @Override
    public void onAction() {
        System.out.printf("Engine is warming up, vehicle:'%s'%n",vehicle);
    }

    @Override
    public void evaluate() {
        System.out.printf("Engine is running, vehicle:'%s'%n",vehicle);
    }

    @Override
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "StartState{" +
               "vehicle=" + vehicle.getModel() +
               '}';
    }
}
