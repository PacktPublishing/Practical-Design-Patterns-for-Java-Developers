import java.util.concurrent.Callable;

interface SensorExecutor<T> {
    SensorResult<T> measure(Callable<T> sensor, SensorCallback<T> callback);
    void start();
    T stopMeasurement(SensorResult<T> measurement);
}
