import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

record RuleOr(Rule rule, Rule additionalRule) implements Rule {
    @Override
    public Collection<Sensor> validateSensors(Collection<Sensor> sensors) {
        Collection<Sensor> ruleSensors = rule.validateSensors(sensors);
        Collection<Sensor> additionalRuleSensors = additionalRule.validateSensors(sensors);
        return Stream.concat(ruleSensors.stream(), additionalRuleSensors.stream())
                .distinct().collect(Collectors.toList());
    }
}
