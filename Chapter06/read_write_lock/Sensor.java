import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

class Sensor {
    private final ReadLock readLock;
    private final WriteLock writeLock;
    private int value = 50;

    Sensor(ReadLock readLock, WriteLock writeLock) {
        this.readLock = readLock;
        this.writeLock = writeLock;
    }

    int getValue() {
        readLock.lock();
        int result;
        try {
            result = value;
            ReadWriteLockUtils.delayMills(result);
        } finally {
            readLock.unlock();
        }
        return result;
    }

    void writeValue(int v) {
        writeLock.lock();
        try {
            this.value = v;
            ReadWriteLockUtils.delayMills(v);
        } finally {
            writeLock.unlock();
        }
    }
}
