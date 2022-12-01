import jdk.jfr.Category;
import jdk.jfr.Description;
import jdk.jfr.Event;
import jdk.jfr.Label;
import jdk.jfr.Name;

@Name("example.IntersectionWorkerEvent")
@Label("IntersectionWorker")
@Category("HotMethods_Example")
@Description("work by one worker")
public class VehicleAnalyticalWorkerEvent extends Event {
    @Label("IntersectionWorker-id")
    @Description("id")
    private int id;
    @Label("IntersectionWorker-size")
    @Description("intersection size")
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
