public abstract sealed class NormalEngine permits Car {
    protected boolean running;

    public NormalEngine() {
        this.running = false;
    }

    public void start() {
        System.out.println("NormalEngine, start");
        this.running = true;
    }

    public void stop() {
        System.out.println("NormalEngine, stop");
        this.running = false;
    }
}
