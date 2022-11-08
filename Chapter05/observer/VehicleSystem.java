import java.util.ArrayList;
import java.util.List;

class VehicleSystem {
    private final List<SystemObserver> observers = new ArrayList<>();
    private String state;

    String state() {
        return state;
    }

    void setState(String s) {
        this.state = s;
        observersNotifyAll();
    }

    void attach(SystemObserver systemObserver){
        observers.add(systemObserver);
    }

    private void observersNotifyAll(){
        observers.forEach(SystemObserver::update);
    }
}
