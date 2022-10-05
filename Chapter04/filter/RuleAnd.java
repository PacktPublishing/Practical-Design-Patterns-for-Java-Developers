import java.util.Collection;

record RuleAnd(Rule rule, Rule additionalRule) implements Rule {
    @Override
    public Collection<Sensor> validateSensors(Collection<Sensor> sensors) {
        Collection<Sensor> initRule = rule.validateSensors(sensors);
        return additionalRule.validateSensors(initRule);
    }
}
