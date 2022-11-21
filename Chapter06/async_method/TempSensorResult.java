import java.util.ArrayList;
import java.util.List;

class TempSensorResult<T> implements SensorResult<T>{

    private final List<Throwable> exceptions = new ArrayList<>();
    private final SensorCallback<T> callback;
    private T value;

    public TempSensorResult(SensorCallback<T> callback) {
        this.callback = callback;
    }

    @Override
    public boolean isPresent() {
        return value != null;
    }

    @Override
    public void setResult(T value) {
        this.value = value;
    }

    @Override
    public T getResult() {

        callback.onMeasurement(value);
        return value;
    }

    @Override
    public void await() {
        AsyncMethodUtils.delayMills(2);
    }

    @Override
    public void addException(Throwable t) {
        exceptions.add(t);
    }

    @Override
    public void printExceptions() {
        exceptions.stream().map(Throwable::getMessage).forEach(System.out::println);
    }
}
