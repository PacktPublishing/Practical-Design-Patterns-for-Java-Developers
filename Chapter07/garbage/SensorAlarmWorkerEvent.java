import jdk.jfr.Category;
import jdk.jfr.Description;
import jdk.jfr.Event;
import jdk.jfr.Label;
import jdk.jfr.Name;

@Name("garbage.SensorAlarmWorkerEvent")
@Label("SensorAlarm_Worker")
@Category("SensorAlarm_Example")
@Description("measurement values")
public class SensorAlarmWorkerEvent extends Event {

    @Label("SensorAlarm_value")
    @Description("SensorAlarm_value")
    private Integer value;

    public SensorAlarmWorkerEvent(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
