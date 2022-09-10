class FastEngine implements Engine{
    private final String type;
    private boolean started;

    public FastEngine(String type) {
        this.type = type;
    }

    @Override
    public void start() {
        System.out.println("FastEngine, started");
        started = true;
    }

    @Override
    public boolean isStarted() {
        return started;
    }

    @Override
    public void run() {
        if(started){
            System.out.println("FastEngine, run");
        } else {
            throw new IllegalStateException("FastEngine, not started");
        }
    }

    @Override
    public String type() {
        return type;
    }
}
