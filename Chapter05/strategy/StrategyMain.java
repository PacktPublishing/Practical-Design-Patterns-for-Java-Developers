class StrategyMain {
    public static void main(String[] args) {
        System.out.println("Strategy Pattern, changing transport options");

        var driver = new VehicleDriver(new CarStrategy());
        driver.transport();
        driver.changeStrategy(new BusStrategy());
        driver.transport();
        driver.changeStrategy(new TruckStrategy());
        driver.transport();
    }

}
