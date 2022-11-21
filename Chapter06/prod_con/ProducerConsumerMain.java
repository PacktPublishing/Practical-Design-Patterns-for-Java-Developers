import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

class ProducerConsumerMain {
    public static void main(String[] args) throws Exception{
        System.out.println("Producer-Consumer pattern, decoupling receiver and emitters");
        var producersNumber = 12;
        var consumersNumber = 10;
        var container = new EventsContainer(3);

        ExecutorService producerExecutor = Executors.newFixedThreadPool(4, new ProdConThreadFactory("prod"));
        ExecutorService consumersExecutor = Executors.newFixedThreadPool(2, new ProdConThreadFactory("con"));
        IntStream.range(0, producersNumber)
                .boxed().map(i -> new EventProducer(container))
                .forEach(producerExecutor::submit);
        IntStream.range(0, consumersNumber)
                .boxed().map(i -> new EventConsumer(i,container))
                .forEach(consumersExecutor::submit);
        TimeUnit.MILLISECONDS.sleep(200);
        producerExecutor.shutdown();
        consumersExecutor.shutdown();
    }
}
