import java.util.concurrent.TimeUnit;

final class AsyncMethodUtils {
    private AsyncMethodUtils(){};
    static void delayMills(int mills){
        try {
            TimeUnit.MILLISECONDS.sleep(mills);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
