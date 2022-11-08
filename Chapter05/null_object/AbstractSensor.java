sealed abstract class AbstractSensor permits NullSensor, VehicleSensor {
    protected final String type;

    AbstractSensor(String type) {
        this.type = type;
    }

    abstract boolean isAvailable();
    String getType(){
        return type;
    }

    @Override
    public String toString() {
        return "Sensor{" +
               "type='" + type + '\'' +
               '}';
    }
}
