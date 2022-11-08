import java.util.Arrays;

class TemplateMethodMain {
    public static void main(String[] args) {
        System.out.println("Template method Pattern, changing transport options");
        Arrays.asList(new BreaksSensor(), new EngineSensor())
                .forEach(VehicleSensor::activate);

    }
}
