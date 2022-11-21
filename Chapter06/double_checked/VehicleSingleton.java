final class VehicleSingleton implements Vehicle{
    private static VehicleSingleton INSTANCE;
    public static VehicleSingleton getInstance(){
        if(INSTANCE == null){
            INSTANCE = new VehicleSingleton();
        }
        return INSTANCE;
    }

    private final String type;

    VehicleSingleton() {
        this.type = Thread.currentThread().getName();
        System.out.printf("""
                VehicleSingleton, constructor thread:'%s' hashCode:'%s'%n""", type, this.hashCode());
    }

    @Override
    public String type() {
        return type;
    }
}
