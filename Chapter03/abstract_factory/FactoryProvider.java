final class FactoryProvider {
    private FactoryProvider(){}
    static AbstractFactory getFactory(String type){
        return switch (type) {
            case "car" -> new CarFactory();
            case "truck" -> new TruckFactory();
            default -> throw new IllegalArgumentException("""
                this is %s""".formatted(type));
        };
    } 
}
