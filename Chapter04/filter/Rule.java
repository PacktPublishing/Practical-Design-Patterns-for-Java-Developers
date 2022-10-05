import java.util.Collection;

@FunctionalInterface
interface Rule {
    Collection<Sensor> validateSensors(Collection<Sensor> sensors);
}
