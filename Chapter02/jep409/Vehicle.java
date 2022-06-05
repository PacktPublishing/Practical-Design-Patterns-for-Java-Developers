public sealed interface Vehicle permits Car, Bus {
    void start();
    void stop();
}
