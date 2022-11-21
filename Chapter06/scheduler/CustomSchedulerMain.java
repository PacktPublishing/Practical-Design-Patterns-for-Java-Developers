import java.util.concurrent.TimeUnit;

class CustomSchedulerMain {
    public static void main(String[] args) throws Exception {
        System.out.println("Scheduler pattern, temperatures measurement");
        var scheduler = new CustomScheduler(100);
        scheduler.run();
        for(int i=0; i < 15; i++){
            scheduler.addTask(new SensorTask("temperature-"+i));
        }

        TimeUnit.SECONDS.sleep(1);
        scheduler.stop();
    }
}
