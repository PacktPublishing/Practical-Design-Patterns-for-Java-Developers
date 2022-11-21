final class VehicleSingletonChecked implements Vehicle {

    private static VehicleSingletonChecked INSTANCE;

    static VehicleSingletonChecked getInstance() {
        if (INSTANCE == null) {
            synchronized (VehicleSingletonChecked.class) {
                if (INSTANCE == null) {
                    INSTANCE = new VehicleSingletonChecked();
                }
            }
        }
        return INSTANCE;
    }

    private final String type;

    VehicleSingletonChecked() {
        this.type = Thread.currentThread().getName();
        System.out.printf("""
                VehicleSingletonChecked, constructor thread:'%s' hashCode:'%s'%n""", type, this.hashCode());
    }

    @Override
    public String type() {
        return type;
    }
}
