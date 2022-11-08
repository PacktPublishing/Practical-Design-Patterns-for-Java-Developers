sealed abstract class SystemObserver permits CockpitObserver, EngineObserver {
    protected final VehicleSystem system;

    SystemObserver(VehicleSystem system) {
        this.system = system;
    }

    abstract void update();
}
