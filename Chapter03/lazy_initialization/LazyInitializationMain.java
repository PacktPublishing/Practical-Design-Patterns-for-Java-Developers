class LazyInitializationMain {
    public static void main(String[] args) {
        System.out.println("Pattern Lazy Initialization: lazy vehicles");

        var vehicleProvider = new VehicleProvider();
        var truck1 = vehicleProvider.getVehicleByType("truck");
        vehicleProvider.printStatus();
        truck1.move();
        var car1 = vehicleProvider.getVehicleByType("car");
        var car2 = vehicleProvider.getVehicleByType("car");
        vehicleProvider.printStatus();
        car1.move();
        car2.move();
        System.out.println("ca1==car2: " + (car1.equals(car2)));

    }    
}
