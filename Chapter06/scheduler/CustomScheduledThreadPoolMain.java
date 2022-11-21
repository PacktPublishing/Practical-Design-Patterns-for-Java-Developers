import java.util.concurrent.TimeUnit;

class CustomScheduledThreadPoolMain {
    public static void main(String[] args) throws Exception {
        System.out.println("Pooled scheduler pattern , providing sensor values");
        var pool = new CustomScheduledThreadPoolExecutor(2);

        for(int i=0; i < 4; i++){
            pool.scheduleAtFixedRate(new SensorTask("temperature-"+i), 0, 50, TimeUnit.MILLISECONDS);
        }
        TimeUnit.MILLISECONDS.sleep(600);
        pool.shutdown();
    }
}
