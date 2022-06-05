/**
 * JEP-420: Pattern Matching for switch (Second Preview)
 * note: requires to have enabled preview features
 * 
 * $javac --enable-preview --release 18 Jep420.java
 * $java --enable-preview Jep420
 * 
 * {@link https://openjdk.java.net/jeps/420}
 */
public class Jep420 {
    public static void main(String[] args) {
        Object variable = 42;
        String text = switch (variable){
            case Integer i -> "number"+i;
            default -> "text";
        };
        System.out.println(text);
    }
}