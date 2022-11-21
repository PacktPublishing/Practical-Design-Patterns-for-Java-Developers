import java.util.concurrent.TimeUnit;

final class ReadWriteLockUtils {
    private ReadWriteLockUtils(){};
    static void delayMills(int mills){
        try {
            TimeUnit.MILLISECONDS.sleep(mills);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
