import java.util.ArrayList;
import java.util.List;

class FilterMain {
    private static final List<Sensor> vehicleSensors = new ArrayList<>();
    static {
        vehicleSensors.add(new Sensor("fuel", true));
        vehicleSensors.add(new Sensor("fuel", false));
        vehicleSensors.add(new Sensor("speed", false));
        vehicleSensors.add(new Sensor("speed", true));
    }
    public static void main(String[] args) {
        System.out.println("Pattern Filter, vehicle sensors");
        Rule analog = new RuleAnalog();
        Rule speedSensor = new RuleType("speed");

        System.out.println("AnalogSensors: " + analog.validateSensors(vehicleSensors));
        System.out.println("SpeedSensors: " + speedSensor.validateSensors(vehicleSensors));

        var analogAndSpeedSensors = new RuleAnd(analog, speedSensor);
        var analogOrSpeedSensors = new RuleOr(analog, speedSensor);
        System.out.println("analogAndSpeedSensors=" + analogAndSpeedSensors.validateSensors(vehicleSensors));
        System.out.println("analogOrSpeedSensors=" + analogOrSpeedSensors.validateSensors(vehicleSensors));
    }
}
