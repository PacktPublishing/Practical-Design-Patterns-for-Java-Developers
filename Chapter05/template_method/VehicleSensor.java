abstract sealed class VehicleSensor permits BreaksSensor, EngineSensor {
    abstract void init();
    abstract void startMeasure();
    abstract void storeData();
    abstract void stopMeasure();

    final void activate(){
        init();
        startMeasure();
        storeData();
        stopMeasure();
    }
}
