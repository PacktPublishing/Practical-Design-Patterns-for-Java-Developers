import java.util.concurrent.Executors;

class ThreadPoolMain {
    public static void main(String[] args) throws Exception{
        System.out.println("Thread-Pool pattern, providing sensor values");
        var executor = Executors.newFixedThreadPool(5);

        for(int i=0; i < 15; i++){
            var task = new TemperatureTask("temp" + i);
            var worker  = new SensorWorker(task);
            executor.submit(worker);
        }
        executor.shutdown();
    }
}
