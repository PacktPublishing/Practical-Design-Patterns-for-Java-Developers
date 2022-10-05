import java.util.ArrayList;
import java.util.List;

class SportVehicle implements Vehicle<VehiclePart> {
    private final String type;
    private final List<VehiclePart> parts;

    SportVehicle(String type) {
        this.type = type;
        this.parts = new ArrayList<>();
    }

    @Override
    public void addPart(VehiclePart p) {
        this.parts.add(p);
    }

    @Override
    public void printParts() {
        System.out.printf("""
                SportCar, type'%s', parts:'%s'%n""", type, parts);
    }
}
