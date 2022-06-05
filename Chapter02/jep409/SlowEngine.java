public abstract sealed class SlowEngine permits Bus  {
    protected boolean running;
    public SlowEngine(){
        this.running = false;
    }

    public void start(){
        System.out.println("SlowEngine, start");
        this.running = true;
    }

    public void stop(){
        System.out.println("SlowEngine, stop");
        this.running = false;
    }
}
