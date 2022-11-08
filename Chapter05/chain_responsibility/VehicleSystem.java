sealed abstract class VehicleSystem permits DriverSystem, EngineSystem, TransmissionSystem {

    protected final SystemType type;
    protected VehicleSystem nextSystem;
    protected boolean active;

    VehicleSystem(SystemType type) {
        this.type = type;
    }

    void setNext(VehicleSystem system){
        this.nextSystem = system;
    }

    void powerOn(){
        if(!this.active){
            activate();
        }
        if(nextSystem != null){
            nextSystem.powerOn();
        }
    }

    abstract void activate();
}
