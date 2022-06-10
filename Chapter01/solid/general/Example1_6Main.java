import java.util.Arrays;
import java.util.List;

public class Example1_6Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = Arrays.asList(new Truck(), new Car());
        vehicles.get(0).move();

    }
}
