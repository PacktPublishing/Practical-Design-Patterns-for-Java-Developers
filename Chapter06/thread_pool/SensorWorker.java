class SensorWorker implements Runnable {
    private final SensorTask task;

    SensorWorker(SensorTask task) {
        this.task = task;
    }

    @Override
    public void run() {
        try {
            task.measure();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
