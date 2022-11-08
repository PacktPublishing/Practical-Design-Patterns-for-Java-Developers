final class VehicleProcessor {
    static void acceptMessage(String sensorType, String message){
        System.out.printf("""
                Sensor:'%s', delivered message:'%s'%n""", sensorType, message);
    }
}
