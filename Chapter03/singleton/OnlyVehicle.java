class OnlyVehicle {
    
    private static OnlyVehicle INSTANCE = new OnlyVehicle();
    static OnlyVehicle getInstance(){
        return INSTANCE;
    }

    private final Engine engine;

    private OnlyVehicle(){
        this.engine = OnlyEngine.getInstance();    
        //this.engine = OnlyEngineEnum.INSTANCE;
    }

    void move(){
        System.out.println("OnlyVehicle, move");       
    }  

    Engine getEngine(){
        return engine;
    }

}
