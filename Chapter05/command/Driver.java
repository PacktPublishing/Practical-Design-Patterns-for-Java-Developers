import java.util.ArrayList;
import java.util.List;

class Driver {
    private final List<VehicleCommand> commands = new ArrayList<>();

    void addCommand(VehicleCommand command){
        commands.add(command);
    }

    void executeCommands(final String command){
        commands.forEach(c -> c.process(command));
        commands.clear();
    }
}
