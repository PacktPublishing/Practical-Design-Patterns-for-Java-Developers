final class VehicleFactory {
    private VehicleFactory(){}
    static Vehicle produce(String type){
        return switch (type) {
            case "sport" -> new SportCar("porsche 911");
            case "suv" -> new SuvCar("skoda kodiaq");
            default -> throw new IllegalArgumentException("""
                    not implemented type:'%s'
                    """.formatted(type));
                
        };
    }
}
