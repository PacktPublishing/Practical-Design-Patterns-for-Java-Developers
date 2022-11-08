import java.util.List;
import java.util.stream.Stream;

final class VehicleSensorsProvider {
    private static final List<AbstractSensor> sensors = Stream.of("engine", "breaks")
            .map(String::toLowerCase).map(VehicleSensor::new)
            .map(AbstractSensor.class::cast).toList();

    private VehicleSensorsProvider(){}

    static AbstractSensor getSenorByType(String type){
        return sensors.stream().filter(s -> s.type.equals(type))
                .findFirst()
                .orElseGet(NullSensor::new);
    }
}
