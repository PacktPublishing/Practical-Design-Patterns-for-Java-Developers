class BreaksModule implements VehicleModule{
    private static BreaksModule INSTANCE;
    static BreaksModule getInstance(){
        if(INSTANCE == null){
            INSTANCE = new BreaksModule();
        }
        System.out.println("BreaksModule, unit:" + INSTANCE);
        return INSTANCE;
    }
    private boolean ready;
    private BreaksModule(){}

    @Override
    public void init() {
        System.out.println("BreaksModule, init");
        ready = true;
    }


    @Override
    public void status() {
        System.out.println("BreaksModule, ready:" + ready);
    }
}
