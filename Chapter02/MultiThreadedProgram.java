public class MultiThreadedProgram {
    public static void main(String[] args) {
        var t = new Thread(() -> {
            while(true){System.out.println("Welcome Thread!");}
        });
        // t.setDaemon(true);
        t.start();
    }
}
