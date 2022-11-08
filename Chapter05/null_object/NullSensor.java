final class NullSensor extends AbstractSensor{

    public NullSensor() {
        super("not_available");
    }

    @Override
    boolean isAvailable() {
        return false;
    }
}
