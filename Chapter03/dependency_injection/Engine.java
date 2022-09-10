interface Engine {
    void start();
    boolean isStarted();
    void run();

    String type();
}