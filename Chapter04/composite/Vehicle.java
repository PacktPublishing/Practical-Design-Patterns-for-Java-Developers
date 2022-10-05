interface Vehicle<T extends VehicleElement<T>> extends VehicleElement<T> {
    void printParts();
}
