import java.util.ArrayList;
import java.util.List;

final class ThreadContainer {

    public static final class Builder {

        private ThreadGroup threadGroup = new ThreadGroup("SensorAlarmWorkers");
        private int threadsNumber = 0;
        private final ThreadContainer container;

        public Builder() {
            this.container = new ThreadContainer();
        }

        public Builder addThreadGroup(String name) {
            this.threadGroup = new ThreadGroup(name);
            return this;
        }

        public void addRunnable(Runnable r) {
            container.addRunnable(threadGroup, r, threadsNumber++);
        }

        public ThreadContainer build() {
            return container;
        }

    }

    private final List<Thread> list = new ArrayList<>();
    private boolean started;

    private ThreadContainer() {
    }

    void addRunnable(ThreadGroup g, Runnable r, int number) {
        list.add(new Thread(g, r, g.getName() + "-" + number));
    }

    public void startAsDaemon() {
        if (!started) {
            for (Thread t : list) {
                t.setDaemon(true);
                t.start();
            }
            started = true;
        }
    }

    public boolean isStarted() {
        return started;
    }
}
