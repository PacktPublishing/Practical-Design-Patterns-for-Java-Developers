class EngineModule implements VehicleModule {
    private static volatile EngineModule INSTANCE;

    static EngineModule getInstance() {
        if (INSTANCE == null) {
            synchronized (EngineModule.class) {
                if (INSTANCE == null) {
                    INSTANCE = new EngineModule();
                }
            }
        }
        System.out.println("EngineModule, unit:" + INSTANCE);
        return INSTANCE;
    }

    private boolean ready;

    private EngineModule() {
    }

    @Override
    public void init() {
        System.out.println("EngineModule, init");
        ready = true;
    }

    @Override
    public void status() {
        System.out.println("EngineModule, ready:" + ready);
    }
}
