public class Example1_8Main {
    public static void main(String[] args) {
        var car = new Car();
        var bike = new Bike();

        printIsMoving(new Car());
        printIsMoving(new Bike());
    }

    private static void printIsMoving(Vehicle v) {
        if (v instanceof Car) { System.out.println(v.engineOn()); }
        if(v instanceof Bike) { System.out.println(v.pedalsMove()); }
    }
}
