class EventConsumer implements Runnable {
    private final int number;
    private final EventsContainer container;

    EventConsumer(int number, EventsContainer container) {
        this.number = number;
        this.container = container;
    }

    @Override
    public void run() {
        var even = container.getEvent();
        System.out.printf("""
                VehicleSecurityConsumer,event:'%s', number:'%d', thread:'%s'%n""", even, number, Thread.currentThread().getName());
    }
}
