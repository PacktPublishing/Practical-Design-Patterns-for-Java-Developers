class TwinMain {
    public static void main(String[] args) {
        System.out.println("Pattern Twin, vehicle initiation sequence");

        var vehicleBreaks1  = new VehicleBreaks();
        var vehicleEngine1 = new VehicleEngine();
        vehicleBreaks1.setEngine(vehicleEngine1);
        vehicleEngine1.setBreaks(vehicleBreaks1);

//        vehicleBreaks1.init();
        vehicleEngine1.init();
    }
}
