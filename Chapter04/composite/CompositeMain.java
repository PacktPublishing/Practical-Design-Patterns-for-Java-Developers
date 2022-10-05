class CompositeMain {
    public static void main(String[] args) {
        System.out.println("Pattern Composite, vehicle parts...");
        var fastVehicle = new SportVehicle("sport");
        var engine = new VehiclePart("fast-engine");
        engine.addPart(new VehiclePart("cylinder-head"));
        var breaks = new VehiclePart("super-breaks");
        var transmission = new VehiclePart("automatic-transmission");
        fastVehicle.addPart(engine);
        fastVehicle.addPart(breaks);
        fastVehicle.addPart(transmission);
        fastVehicle.printParts();
    }
}
