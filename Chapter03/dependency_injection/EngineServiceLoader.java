public class EngineServiceLoader implements Engine{

    public EngineServiceLoader(){}

    @Override
    public void start() {
        System.out.println("EngineServiceLoader, start");
    }

    @Override
    public boolean isStarted() {
        return false;
    }

    @Override
    public void run() {

    }

    @Override
    public String type() {
        return null;
    }
}