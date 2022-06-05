/**
 * JEP-394: Pattern Matching for instanceof
 * {@link https://openjdk.java.net/jeps/394}
 */
public class Jep394 {
    public static void main(String[] args) {
        Object obj = "text";
        if(obj instanceof String s){
            System.out.println(s.toUpperCase());
        }
    }
}
