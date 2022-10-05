abstract class AbstractVehiclePart {

    private boolean ready;

    protected AbstractVehiclePart(){
        System.out.println("AbstractVehiclePart, constructor");
    }

    boolean isReady(){
        return ready;
    }

    protected void setReady(){
        this.ready = true;
    }

    abstract void init();
}
