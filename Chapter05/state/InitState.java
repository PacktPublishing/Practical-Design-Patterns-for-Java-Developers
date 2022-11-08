class InitState implements VehicleState{
    private Vehicle vehicle;

    @Override
    public void onAction() {
        System.out.printf("Turning on the key, vehicle:'%s'%n",vehicle);
    }

    @Override
    public void evaluate() {
        System.out.printf("Initiation sequence, vehicle:'%s'%n",vehicle);
    }

    @Override
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "InitState{" +
               "vehicle=" + vehicle.getModel() +
               '}';
    }
}
