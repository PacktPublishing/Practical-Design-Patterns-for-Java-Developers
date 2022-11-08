import java.util.Random;

final class EngineObserver extends  SystemObserver {
    private static final Random RANDOM = new Random();
    public EngineObserver(VehicleSystem system) {
        super(system);
        this.system.attach(this);
    }

    @Override
    void update() {
        System.out.printf("""
                EngineObserver, temperature:'%d'%n""", getTemperature());
    }

    private int getTemperature(){
        return RANDOM.nextInt(0, 100);
    }
}
