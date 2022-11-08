import java.util.ArrayList;
import java.util.List;

final class AirConditionSystemCareTaker {
    private final List<SystemMemento> memory = new ArrayList<>();

    AirConditionSystemCareTaker() {
    }

    int add(SystemMemento m) {
        int pos = memory.size();
        memory.add(m);
        return pos;
    }

    SystemMemento getMemento(int i) {
        return memory.get(i);
    }
}
