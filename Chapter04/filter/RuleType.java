import java.util.Collection;
import java.util.stream.Collectors;

class RuleType implements Rule {
    private final String type;

    RuleType(String type) {
        this.type = type;
    }

    @Override
    public Collection<Sensor> validateSensors(Collection<Sensor> sensors) {
        return sensors.stream()
                .filter(s -> s.type().equalsIgnoreCase(type))
                .collect(Collectors.toList());
    }
}
