class DieselVehicle implements Vehicle{
    @Override
    public void start() {
        System.out.println("DieselVehicle, engine warm up");
        System.out.println("DieselVehicle, engine start");
    }

    @Override
    public void refuel() {
        System.out.println("DieselVehicle, refuel diesel");
    }
}
