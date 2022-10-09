sealed interface VehicleModule permits BreaksModule, EngineModule{
    void init();
    void status();
}
