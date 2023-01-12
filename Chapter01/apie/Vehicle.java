// @start region="vehicle_example"
public class Vehicle {
    public boolean moving;
    public void move(){
        this.moving = true;
        System.out.println("moving...");
    }

    public void stop(){
        this.moving = false;
        System.out.println("stopped...");
    }
}
// @end