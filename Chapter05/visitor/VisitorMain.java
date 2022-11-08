class VisitorMain {
    public static void main(String[] args) {
        System.out.println("Visitor Pattern, check vehicle parts");
        var vehicleCheck = new VehicleCheck();
        vehicleCheck.accept(new VehicleSystemCheckVisitor());
    }
}
