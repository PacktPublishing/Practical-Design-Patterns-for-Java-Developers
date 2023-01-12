class FrontControllerMain {
    public static void main(String[] args) {
        System.out.println("Pattern FrontController, vehicle system");
        var vehicleController = new VehicleController();

        vehicleController.processRequest("engine");
        vehicleController.authorize();
        vehicleController.processRequest("engine");
        vehicleController.processRequest("breaks");
    }
}
