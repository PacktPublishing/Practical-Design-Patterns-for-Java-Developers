// @start region="polymorphism_override"
public class Car extends Vehicle {
    @Override
    public void move(){
        System.out.println("moving faster...");
    }
}
// @end