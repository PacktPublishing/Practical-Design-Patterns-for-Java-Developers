import java.util.Collection;

class VehicleAnalyticalWorker implements Runnable {

    private final int id;
    private final int elementsNumber;
    private final Collection<Integer> c1;
    private final Collection<Integer> c2;
    private boolean active;

    public VehicleAnalyticalWorker(int id, int elementsNumber, Collection<Integer> c1, Collection<Integer> c2) {
        this.id = id;
        this.elementsNumber = elementsNumber;
        this.c1 = c1;
        this.c2 = c2;
        this.active =true;
    }


    @Override
    public void run() {
        while (active) {
            VehicleAnalyticalWorkerEvent event = new VehicleAnalyticalWorkerEvent(id);
            event.begin();
            VehicleDataContainer vc1 = new VehicleDataContainer(elementsNumber, c1);
            VehicleDataContainer vc2 = new VehicleDataContainer(elementsNumber, c2);

            vc1.init(5);
            vc2.init(7);

            int countIntersections = vc1.countIntersections(vc2);
            event.setIntersectionSize(countIntersections);
            event.commit();
            Thread.yield();
        }
    }
}
