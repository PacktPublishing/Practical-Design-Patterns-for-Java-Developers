final class EngineSensor extends VehicleSensor{
    @Override
    void init() {
        System.out.println("EngineSensor, initiated");
    }

    @Override
    protected void startMeasure() {
        System.out.println("EngineSensor, measurement started");
    }

    @Override
    void storeData() {
        System.out.println("EngineSensor, data stored");
    }

    @Override
    void stopMeasure() {
        System.out.println("EngineSensor, measurement stopped");
    }
}
