final class Vehicle {
    private final String model;
    private VehicleState state;

    Vehicle(String model) {
        this.model = model;
    }

    String getModel() {
        return model;
    }

    VehicleState getState() {
        return state;
    }

    void setState(VehicleState state) {
        state.setVehicle(this);
        this.state = state;

    }

    @Override
    public String toString() {
        return "Vehicle{" +
               "model='" + model + '}';
    }
}
