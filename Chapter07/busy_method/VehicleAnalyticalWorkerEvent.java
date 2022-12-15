import jdk.jfr.Category;
import jdk.jfr.Description;
import jdk.jfr.Event;
import jdk.jfr.Label;
import jdk.jfr.Name;

@Name("busy_method.VehicleAnalyticalWorkerEvent")
@Label("VehicleAnalyticalWorker")
@Category("Busy Method")
@Description("Analytical Worker")
public class VehicleAnalyticalWorkerEvent extends Event {
    @Label("AnalyticalWorker-id")
    @Description("id")
    private int id;
    @Label("measured size")
    @Description("batch size")
    private int intersectionSize;

    public VehicleAnalyticalWorkerEvent(Integer id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIntersectionSize() {
        return intersectionSize;
    }

    public void setIntersectionSize(int intersectionSize) {
        this.intersectionSize = intersectionSize;
    }
}
