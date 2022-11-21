import java.util.ArrayList;

class AsyncMethodMain {
    public static void main(String[] args) throws Exception {
        System.out.println("Async method invocation Pattern, moving vehicle");
        var sensorTaskExecutor = new TempSensorExecutor<Integer>();
        var tempSensorCallback = new TempSensorCallback();

        var tasksNumber = 5;
        var measurements = new ArrayList<SensorResult<Integer>>();
        System.out.printf("""
                    AsyncMethodMain, tasksNumber:'%d' %n""", tasksNumber);
        for(int i=0; i<tasksNumber; i++) {
            var sensorResult = sensorTaskExecutor.measure(new TempSensorTask(), tempSensorCallback);
            measurements.add(sensorResult);
        }
        sensorTaskExecutor.start();
        AsyncMethodUtils.delayMills(10);
        for(int i=0; i< tasksNumber; i++){
            var temp = sensorTaskExecutor.stopMeasurement(measurements.get(i));
            System.out.printf("""
                    AsyncMethodMain, sensor:'%d' temp:'%d'%n""", i, temp);
        }



    }
}
