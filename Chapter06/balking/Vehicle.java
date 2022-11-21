import java.util.Random;
import java.util.concurrent.TimeUnit;

class Vehicle {
    private static final Random RANDOM = new Random();
    private VehicleState state;

    public Vehicle() {
    }

    private void init() {
        stop();
    }

    private synchronized void stop(){
        state = VehicleState.STOPPED;
    }

    void drive() {
        try {
            driveWithMills(RANDOM.nextInt(50,100));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    synchronized void driveWithMills(int mills) throws InterruptedException {
            var internalState = getState();
            switch (internalState) {
                case MOVING -> System.out.printf("""
                        Vehicle state:'%s', vehicle in move, millis:'%d', thread='%s'%n""", state, mills, Thread.currentThread());
                case STOPPED -> startEngineAndMove(mills);
                case null -> init();
            }

    }

    private VehicleState getState(){
        return state;
    }

    private void startEngineAndMove(int mills) throws InterruptedException {
        state = VehicleState.MOVING;
        System.out.printf("""
                Vehicle state:'%s', moving, mills:'%d', thread='%s'%n""", state, mills, Thread.currentThread());
        TimeUnit.MILLISECONDS.sleep(mills);
        stop();
        System.out.printf("""
                Vehicle state:'%s' stopped, mills:'%d', thread='%s'%n""", state, mills, Thread.currentThread());

    }

}
