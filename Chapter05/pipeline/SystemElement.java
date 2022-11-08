import java.util.ArrayList;
import java.util.List;

final class SystemElement implements Element{
    private final List<String> log = new ArrayList<>();

    @Override
    public void addLog(String log) {
        this.log.add(log);
    }

    @Override
    public String logSummary() {
        return String.join(",", log);
    }
}
