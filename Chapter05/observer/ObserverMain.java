class ObserverMain {
    public static void main(String[] args) {
        System.out.println("Observer Pattern, vehicle temperature senors");
        var temperatureControlSystem = new VehicleSystem();
        new CockpitObserver(temperatureControlSystem);
        new EngineObserver(temperatureControlSystem);

        temperatureControlSystem.setState("low");
    }
}
