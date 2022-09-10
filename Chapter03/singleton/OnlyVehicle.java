public class OnlyVehicle {
    
    private static OnlyVehicle INSTANCE = new OnlyVehicle();
    static OnlyVehicle getInstance(){
        return INSTANCE;
    }

    private OnlyVehicle(){
        this.engine = OnlyEngine.getInstance();    
    }
    private OnlyEngine engine;

    void move(){
        System.out.println("OnlyVehicle, move");       
    }  

    OnlyEngine getEngine(){
        return engine;
    }

}
