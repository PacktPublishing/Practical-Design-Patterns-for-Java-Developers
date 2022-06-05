/**
 * JEP-361: Switch Expressions
 * {@link https://openjdk.java.net/jeps/361}
 */
public class Jep361 {
    public static void main(String[] args) {
        var inputNumber = 42;
        String textNumber = switch (inputNumber){
            case 22,42 -> String.valueOf(inputNumber);
            default -> throw new RuntimeException("not allowed");
        };
        System.out.printf("""
                number:'%s'
                %n""", textNumber);
    }
}