public abstract class AbstractVehicle implements VehicleInterface{
    abstract public void move();
    public void stop(){
        System.out.println("stopped...");
    }
}
