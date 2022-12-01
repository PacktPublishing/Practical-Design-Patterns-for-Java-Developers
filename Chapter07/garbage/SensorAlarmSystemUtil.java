import java.util.HashMap;
import java.util.Map;

final class SensorAlarmSystemUtil {
    static void evaluateAlarm(Map<Integer, Sensor> storage, Integer criticalValue, long measurementNumber) {
        if (!storage.containsKey(criticalValue)) {
            System.out.println("WARNING, SensorAlarmWorker criticalValue i:"+ criticalValue +" not present!");
        }
        if (++measurementNumber % 1000 == 0) {
            Thread.yield();
        }
    }

    static Map<Integer, Sensor> createMeasurementResutlMap(int size) {
        Map<Integer, Sensor> result = new HashMap<>();
        for (int i = 0; i < size; i++) {
            result.put(i, new Sensor(i));
        }
        return result;
    }

}
