public interface VehicleElement<T extends VehicleElement<T>> {
    void addPart(T e);

}
