/**
 * JEP-395: Records
 * {@link https://openjdk.java.net/jeps/395}
 */
public class Jep395 {
    private record Example(int number, String text){
        private String getTogether(){
            return number + text;
        }
    }

    public static void main(String[] args) {
        var r1 = new Example(1, "text");
        var r2 = new Example(2, "text");
        System.out.println(r1.equals(r2));
        System.out.println(r1.getTogether());
    }
}