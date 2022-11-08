interface VehicleState {
    void onAction();
    void evaluate();

    void setVehicle(Vehicle vehicle);
}
