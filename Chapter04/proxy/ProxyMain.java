class ProxyMain {
    public static void main(String[] args) {
        System.out.println("Pattern Proxy, remote vehicle controller");
        Vehicle vehicle = new VehicleProxy();
        vehicle.move();
        vehicle.move();
    }
}
