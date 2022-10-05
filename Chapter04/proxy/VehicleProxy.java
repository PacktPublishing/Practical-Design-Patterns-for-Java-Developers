class VehicleProxy implements Vehicle{
    private Vehicle vehicleReal;

    @Override
    public void move() {
        if(vehicleReal == null){
            System.out.println("VehicleProxy, real vehicle connected");
            vehicleReal = new VehicleReal();
        }
        vehicleReal.move();
    }
}
