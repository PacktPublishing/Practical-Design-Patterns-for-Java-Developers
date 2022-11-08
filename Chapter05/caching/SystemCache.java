import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class SystemCache {
    private final VehicleSystem[] systems;
    private int end;

    SystemCache(int capacity) {
        this.systems = new VehicleSystem[capacity];
    }

    boolean addSystem(VehicleSystem system) {
        var availableSystem = getSystem(system.type());
        if (availableSystem == null && end < systems.length) {
            systems[end++] = system;
            return true;
        }
        return false;
    }

    VehicleSystem getSystem(String type) {
        for (VehicleSystem s : systems) {
            if (s != null && s.type().equals(type)) {
                return s;
            }
        }
        return null;
    }

    int currentSize(){
        return end;
    }

    String getSystemTypes() {
        return Stream.of(systems).filter(Objects::nonNull).map(s -> """
                '%s':'%s'""".formatted(s.type(), s)).collect(Collectors.joining(","));
    }
}
