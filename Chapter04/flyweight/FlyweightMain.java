class FlyweightMain {
    public static void main(String[] args) {
        System.out.println("Pattern Flyweight, sharing templates");
        Vehicle car1 = VehicleGarage.borrow("sport");
        car1.confirm();
        Vehicle car2 = VehicleGarage.borrow("sport");
        System.out.println("Similar template:" + (car1.equals(car2)));
    }
}
