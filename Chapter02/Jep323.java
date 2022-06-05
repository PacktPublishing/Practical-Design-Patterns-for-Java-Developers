import java.util.function.Consumer;
import java.util.stream.IntStream;

/**
 * JEP-323: Local-Variable Syntax for Lambda Parameters
 * {@link https://openjdk.java.net/jeps/323}
 */
public class Jep323 {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (var number) -> {
            var result = number + 1;
            System.out.println("result:" + result);
        };
        IntStream.of(1, 2, 3).boxed().forEach(consumer);
    }
}