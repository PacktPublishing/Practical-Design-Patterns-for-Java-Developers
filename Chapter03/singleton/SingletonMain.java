final class SingletonMain {
    public static void main(String[] args) {
        System.out.println("Pattern Singleton: "); 
        var engine = OnlyEngine.getInstance();  
        var vehicle = OnlyVehicle.getInstance();
    
        vehicle.move();
        System.out.println("""
            OnlyEngine:'%s', equals with vehicle:'%s'"""
                .formatted(engine, (vehicle.getEngine().equals(engine))));
    }
}
