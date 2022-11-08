class CommandMain {
    public static void main(String[] args) {
        System.out.println("Pattern Command, turn on/off vehicle");

        var vehicle = new Vehicle("sport-car");
        var driver = new Driver();
        driver.addCommand(new StartCommand(vehicle));
        driver.addCommand(new StopCommand(vehicle));
        driver.addCommand(new StartCommand(vehicle));

        driver.executeCommands("start_stop");
    }
}
