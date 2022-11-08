final class Vehicle {
    private final String type;
    private boolean running;

    Vehicle(String type) {
        this.type = type;
    }

    void start() {
        this.running = true;
    }

    void stop() {
        this.running = false;
    }

    boolean isRunning() {
        return running;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", running=" + running +
                '}';
    }
}
