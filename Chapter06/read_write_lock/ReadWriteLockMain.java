import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.stream.IntStream;

class ReadWriteLockMain {
    private static final int NUMBER_READERS = 3;
    private static final int CYCLES_READER = 10;

    public static void main(String[] args) throws Exception {
        System.out.println("Read-Write Lock pattern, writing and reading sensor values");
        ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        var sensor = new Sensor(readWriteLock.readLock(), readWriteLock.writeLock());
        var sensorWriter = new SensorWriter("writer-1", sensor);
        var writerThread = getWriterThread(sensorWriter);

        ExecutorService executor = Executors.newFixedThreadPool(NUMBER_READERS);
        var readers = IntStream.range(0, NUMBER_READERS)
                .boxed().map(i -> new SensorReader("reader-" + i, sensor, CYCLES_READER)).toList();
        readers.forEach(executor::submit);
        writerThread.start();
        executor.shutdown();
    }

    private static Thread getWriterThread(SensorWriter sensorWriter) {
        var writerThread = new Thread(sensorWriter);
        writerThread.setName("pool-2-writer-1");
        writerThread.setDaemon(true);
        return writerThread;
    }
}
