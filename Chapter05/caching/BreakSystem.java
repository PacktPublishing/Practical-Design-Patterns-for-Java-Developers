import java.util.Objects;

final class BreakSystem  implements VehicleSystem {
    private final String name;
    private boolean active;

    BreakSystem(String name) {
        this.name = name;
    }

    @Override
    public String type() {
        return name;
    }

    @Override
    public void init() {

    }

    @Override
    public boolean active() {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BreakSystem that = (BreakSystem) o;
        return active == that.active && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, active);
    }
}
