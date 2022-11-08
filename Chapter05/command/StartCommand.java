record StartCommand(Vehicle vehicle) implements VehicleCommand {
    @Override
    public void process(String command) {
        if(command.contains("start")){
            vehicle.start();
            System.out.println("START:" + vehicle);
        }
    }
}
