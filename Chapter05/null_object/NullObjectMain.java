class NullObjectMain {
    public static void main(String[] args) {
        System.out.println("Null Object Pattern, vehicle sensor");

        var engineSensor = VehicleSensorsProvider.getSenorByType("engine");
        var transmissionSensor = VehicleSensorsProvider.getSenorByType("transmission");
        System.out.println("Engine Sensor: " + engineSensor);
        System.out.println("Transmission Sensor: " + transmissionSensor);
    }
}
