import java.util.ArrayList;
import java.util.List;

class VehiclePart implements VehicleElement<VehiclePart>{
    private final String type;
    private final List<VehiclePart> parts;

    VehiclePart(String type) {
        this.type = type;
        this.parts = new ArrayList<>();
    }

    @Override
    public void addPart(VehiclePart p) {
        this.parts.add(p);
    }

    @Override
    public String toString() {
        return "{" +
                "type='" + type + '\'' +
                ", parts=" + parts +
                '}';
    }
}
