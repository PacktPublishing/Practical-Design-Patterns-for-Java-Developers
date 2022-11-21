import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class EventsContainer {

    private final ReentrantLock lock;
    private final Condition containerFull;
    private final Condition containerReady;
    private final Queue<Event> storage;
    private final int maxSize;

    EventsContainer(int size) {
        this.lock = new ReentrantLock();
        this.containerFull = lock.newCondition();
        this.containerReady = lock.newCondition();
        this.maxSize = size;
        this.storage = new ArrayBlockingQueue<>(maxSize);
    }

    void putEvent(Event event){
        lock.lock();
        try {
            while (storage.size() == maxSize) containerFull.await();
            storage.add(event);
            containerReady.signal();
        } catch (InterruptedException e){
          throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    Event getEvent(){
        lock.lock();
        try {
            while(storage.peek() == null) containerReady.await();
            var result = storage.poll();
            containerFull.signal();
            return result;
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

}
