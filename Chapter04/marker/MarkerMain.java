import java.util.Arrays;

class MarkerMain {
    public static void main(String[] args) {
        System.out.println("Pattern Marker, sensor identification");
        var sensors = Arrays
                .asList(new BreaksSensor(), new EngineSensor()
                        , new ConsumptionSensor());
        sensors.forEach(sensor -> {
            if(sensor.getClass().isAnnotationPresent(CertifiedAnnotation.class)){
                System.out.println("Sensor with Marker annotation:" + sensor);
            } else {
                switch (sensor){
                    case CertifiedSensor cs -> System.out.println("Sensor with Marker interface:" + cs);
                    case Sensor s -> System.out.println("Sensor without identification:"+ s);
                }
            }
        });

    }

}
