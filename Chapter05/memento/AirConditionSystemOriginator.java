final class AirConditionSystemOriginator {
    private String state;

    void setState(String s){
        this.state = s;
    }

    String getState(){
        return state;
    }

    int saveState(AirConditionSystemCareTaker careTaker){
        return careTaker.add(new SystemMemento(state));
    }

    void restoreState(SystemMemento m){
        state = m.state();
    }
}
