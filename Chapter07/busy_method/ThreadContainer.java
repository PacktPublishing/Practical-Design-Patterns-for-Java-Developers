import java.util.ArrayList;
import java.util.List;

class ThreadContainer {

    static final class Builder {

        private ThreadGroup threadGroup = new ThreadGroup("Workers");
        private int threadsNumber = 0;
        private final ThreadContainer container;

        Builder(){
            this.container = new ThreadContainer();
        }

        Builder addThreadGroup(String name) {
            this.threadGroup = new ThreadGroup(name);
            return this;
        }

        Builder addRunnable(Runnable r) {
            container.addRunnable(threadGroup, r, threadsNumber++);
            return this;
        }

        ThreadContainer build() {
            return container;
        }

    }

    private final List<Thread> list = new ArrayList<>();
    private boolean started;

    private ThreadContainer(){}

    void addRunnable(ThreadGroup g, Runnable r, int number){
        list.add(new Thread(g, r, g.getName() + "-" + number));
    }

    void startAsDaemon(){
        if(!started){
            System.out.println("Container started!");
            for(Thread t: list){
                t.setDaemon(true);
                t.start();
            }
            started = true;
        } else {
            System.out.println("Container started");
        }
    }

    boolean isStarted() {
        return started;
    }
}
