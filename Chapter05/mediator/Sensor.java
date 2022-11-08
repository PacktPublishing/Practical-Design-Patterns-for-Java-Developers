record Sensor(String name) {
    void emitMessage(String message) {
        VehicleProcessor.acceptMessage(name, message);
    }
}
