sealed interface VehicleCommand permits StartCommand, StopCommand {
    void process(String command);
}
