/**
 * The following executable class refers to: 
 * <ul>
 *  <li> Example 1.1
 *  <li> Example 1.2
 * </ul>
 * <br>
 * Chapter 1: Getting into Software Design Patterns, Examining OOP and APIE
 * {@snippet file="Example1_2Main.java" region="encapsulation_example"}
 * 
 * <ul>
 * <li>1. Encapsulation
 * {@snippet file="Vehicle.java" region="vehicle_example"}
 * 
 * <li>2. Inheritance 
 * <li>3. Polymorphism
 * {@snippet file="Car.java" region="polymorphism_override"}
 * <li>4. Abstraction
 * </ul>
 * 
 */
public class Example1_2Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Car(); 
        // @start region="encapsulation_example"
        vehicle.move();
        // @end    
    }
}
