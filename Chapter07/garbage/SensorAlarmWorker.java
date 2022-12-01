import java.util.Collection;
import java.util.Map;


class SensorAlarmWorker implements Runnable {
    private final Map<Integer, Sensor> provider;
    private final int id;
    private boolean active;

    SensorAlarmWorker(int id, int size) {
        this.id = id;
        this.provider = SensorAlarmSystemUtil.createMeasurementResutlMap(size);
        this.active = true;
    }

    @Override
    public void run() {
        long measurementCount = 0;
        while (active) {
            SensorAlarmWorkerEvent event = new SensorAlarmWorkerEvent(id);
            event.begin();
            Collection<Sensor> set = provider.values();
            for (Sensor e : set) {
                SensorAlarmSystemUtil.evaluateAlarm(provider, e.value(), measurementCount);
            }
            event.commit();
        }
    }
}
