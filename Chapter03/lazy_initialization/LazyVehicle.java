record LazyVehicle(String type) implements Vehicle{
    @Override
    public void move() {
        System.out.println("LazyVehicle, move, type:" + type);
    }
}