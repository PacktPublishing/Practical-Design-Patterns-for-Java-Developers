import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

class EventProducer implements Runnable{

    private static final AtomicInteger COUNTER = new AtomicInteger();
    private static final Random RANDOM = new Random();
    private final EventsContainer container;

    EventProducer(EventsContainer container) {
        this.container = container;
    }

    @Override
    public void run() {
        var delay = RANDOM.nextInt(20,50);
        var event = new Event(COUNTER.getAndIncrement(), Thread.currentThread().getName());
        container.putEvent(event);
        ProducerConsumerUtil.delayMills(delay);
    }
}
