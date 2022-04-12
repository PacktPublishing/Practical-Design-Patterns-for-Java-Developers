public class Example1_9Main {
    public static void main(String[] args) {
        printIsMoving(new Car());
        printIsMoving(new Bike());
    }


    private static void printIsMoving(Vehicle v){
        // no access to internal state
    }
    private static void printIsMoving(Car c) {
        System.out.println(c.engineOn());
    }
    private static void printIsMoving(Bike b) {
        System.out.println(b.pedalsMove());
    }    
}
