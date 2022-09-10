import java.util.HashMap;
import java.util.Map;

final class EngineServiceProvider {
    private static final Map<String, Engine> ENGINES = new HashMap<>();

    private EngineServiceProvider(){}

    static void addEngine(Engine e){
        ENGINES.put(e.type(), e);
    }

    static Engine getEngineByType(String t){
        return ENGINES.values().stream()
                .filter(e -> e.type().equals(t))
                .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}