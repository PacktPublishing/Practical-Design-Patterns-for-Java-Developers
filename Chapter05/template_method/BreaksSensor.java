final class BreaksSensor extends VehicleSensor{
    @Override
    void init() {
        System.out.println("BreaksSensor, initiated");
    }

    @Override
    void startMeasure() {
        System.out.println("BreaksSensor, measurement started");
    }

    @Override
    void storeData() {
        System.out.println("BreaksSensor, data stored");
    }

    @Override
    void stopMeasure() {
        System.out.println("BreaksSensor, measurement stopped");
    }
}