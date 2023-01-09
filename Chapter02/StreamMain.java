

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamMain {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("one", "two", "forty_two");
        list.forEach(System.out::println);

        Predicate<Integer> numberTest = new Predicate<Integer>() {
            @Override
            public boolean test(Integer e) {
                return e > 2;
            }
        };
        String result = Stream.of(1,2,3, 42)
                //.filter(e -> e > 2) //Anonymous class example
                .filter(numberTest)
                .map(e -> "element" + e)
                .collect(Collectors.joining(","));
        System.out.println("result: " + result);

    }
}
