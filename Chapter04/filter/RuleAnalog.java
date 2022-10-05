import java.util.Collection;
import java.util.stream.Collectors;

class RuleAnalog implements Rule {
    @Override
    public Collection<Sensor> validateSensors(Collection<Sensor> sensors) {
        return sensors.stream()
                .filter(Sensor::analog)
                .collect(Collectors.toList());
    }
}
