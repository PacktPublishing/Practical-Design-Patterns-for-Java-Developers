record StopCommand(Vehicle vehicle) implements VehicleCommand{
    @Override
    public void process(String command) {
        if(command.contains("stop")){
            vehicle.stop();
            System.out.println("STOP:" + vehicle);
        }
    }
}
