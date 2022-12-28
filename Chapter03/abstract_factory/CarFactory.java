class CarFactory extends AbstractFactory{
    @Override
    Vehicle createVehicle(String type) {
        return switch (type) {
            case "slow" -> new SlowVehicle();
            case "fast" -> new FastVehicle();
            default -> throw new IllegalArgumentException("not implemented");
        };
    }   
}
