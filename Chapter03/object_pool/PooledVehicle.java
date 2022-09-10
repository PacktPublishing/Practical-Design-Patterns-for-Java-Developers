import java.util.concurrent.atomic.AtomicInteger;

class PooledVehicle implements Vehicle{
    private static final AtomicInteger COUNTER = new AtomicInteger();

    private final int vin;
    PooledVehicle() {
        this.vin = COUNTER.incrementAndGet();
    }


    @Override
    public int getVin(){
        return vin;
    }

    @Override
    public void move(){
        System.out.println("PooledVehicle, move, vin=" + vin);
    }    
}
