import java.util.Objects;

final class EngineSystem implements VehicleSystem {

    private final String type;
    private boolean active;

    EngineSystem(String type) {
        this.type = type;
    }

    @Override
    public String type() {
        return type;
    }

    @Override
    public void init() {
        this.active = true;
    }

    @Override
    public boolean active() {
        return active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EngineSystem that = (EngineSystem) o;
        return active == that.active && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, active);
    }
}
