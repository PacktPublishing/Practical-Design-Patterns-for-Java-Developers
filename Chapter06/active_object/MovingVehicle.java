import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

abstract class MovingVehicle {
    private static final AtomicInteger COUNTER = new AtomicInteger();
    private final BlockingDeque<Runnable> commands;
    private final String type;
    private final Thread thread;
    private boolean active;

    MovingVehicle(String type) {
        this.commands = new LinkedBlockingDeque<>();
        this.type = type;
        this.thread = createMovementThread();
    }

    protected boolean isActive() {
        return active;
    }

    void move() {
        active = true;
        thread.start();
    }

    void turnOnRadio() throws InterruptedException {
        commands.putLast(() -> {
            ActiveObjectUtil.delayMills(50);
            System.out.printf("""
                    MovingVehicle:'%s', radio on%n""", this.type);
        });
    }

    void turnOffRadio() throws InterruptedException {
        commands.putLast(() -> {
            ActiveObjectUtil.delayMills(50);
            System.out.printf("""
                    MovingVehicle:'%s', radio on%n""", this.type);

        });
    }

    void stopVehicle() throws InterruptedException {
        commands.putFirst(() -> {
            this.active = false;
            ActiveObjectUtil.delayMills(50);
            System.out.printf("""
                    MovingVehicle:'%s', stopping, commands_active:'%d'%n""", this.type, this.commands.size());
        });
    }

    private Thread createMovementThread() {
        var thread = new Thread(() -> {
            while (active) {
                try {
                    var command = commands.take();
                    System.out.printf("""
                            MovingVehicle:'%s', moving%n""", this.type);
                    command.run();
                    ActiveObjectUtil.delayMills(60);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                    active = false;
                }
            }
            System.out.printf("""
                    MovingVehicle:'%s', stopped%n""", this.type);
        });
        thread.setDaemon(true);
        thread.setName("moving-vehicle-" + COUNTER.getAndIncrement());
        return thread;
    }
}
