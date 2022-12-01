import java.util.Collection;

class VehicleDataContainer {

    private final int maxElements;
    private final Collection<Integer> collection;

    VehicleDataContainer(int maxElements, Collection<Integer> collection) {
        this.maxElements = maxElements;
        this.collection = collection;
    }


    void init(int modulo) {
        collection.clear();
        for (int i = 0; i < maxElements; i++) {
            if (i % modulo != 0) collection.add(i);
        }
    }

    Collection<Integer> getCollection() {
        return collection;
    }

    public int countIntersections(VehicleDataContainer c) {
        int count = 0;
        for (int n : collection) {
            if (c.getCollection().contains(n)) {
                count++;
            }
        }
        return count;
    }
}
