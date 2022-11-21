class TempSensorCallback implements SensorCallback<Integer>{
    @Override
    public void onMeasurement(Integer value) {
        AsyncMethodUtils.delayMills(10);
        System.out.printf("""
                TemperatureSensorCallback, recorded value:'%d', thread:'%s'%n""", value, Thread.currentThread().getName());
    }
}
