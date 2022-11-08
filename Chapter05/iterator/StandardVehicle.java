final class StandardVehicle implements Vehicle {

    private final String[] vehiclePartsNames = {"engine", "breaks", "navigation"};
    private class VehiclePartsIterator implements PartsIterator {

        private int currentIndex;

        @Override
        public boolean hasNext() {
            return currentIndex < vehiclePartsNames.length;
        }

        @Override
        public VehiclePart next() {
            return hasNext() ? new VehiclePart(vehiclePartsNames[currentIndex++]) : null;
        }
    }

    @Override
    public PartsIterator getParts() {
        return new VehiclePartsIterator();
    }
}
