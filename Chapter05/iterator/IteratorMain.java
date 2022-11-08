class IteratorMain {
    public static void main(String[] args) {
        System.out.println("Iterator Pattern, vehicle parts");
        var standardVehicle = new StandardVehicle();
        for(PartsIterator part = standardVehicle.getParts(); part.hasNext();){
            var vehiclePart = part.next();
            System.out.println("VehiclePart name:" + vehiclePart.name());
        }
    }
}
