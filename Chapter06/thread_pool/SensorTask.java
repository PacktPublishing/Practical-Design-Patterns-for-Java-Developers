sealed interface SensorTask permits TemperatureTask {
    void measure() throws InterruptedException;
}
