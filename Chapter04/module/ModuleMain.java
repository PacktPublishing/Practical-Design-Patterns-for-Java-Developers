class ModuleMain {
    private static BreaksModule breaksModule;
    private static EngineModule engineModule;

    private static void initModules() {
        breaksModule = BreaksModule.getInstance();
        engineModule = EngineModule.getInstance();
        engineModule.init();
    }

    private static void printStatus() {
        breaksModule.status();
        engineModule.status();
    }

    public static void main(String[] args) {
        initModules();
        printStatus();
    }
}
