sealed interface VehicleSystem permits BreakSystem, EngineSystem, SuspensionSystem {
    String type();
    void init();
    boolean active();
}
