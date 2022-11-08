class MementoMain {
    public static void main(String[] args) {
        System.out.println("Memento Pattern, air-condition system");
        var originator = new AirConditionSystemOriginator();
        var careTaker = new AirConditionSystemCareTaker();

        originator.setState("low");
        var stateLow = originator.saveState(careTaker);
        originator.setState("medium");
        var stateMedium = originator.saveState(careTaker);
        originator.setState("high");
        var stateHigh = originator.saveState(careTaker);

        System.out.printf("""
                Current Air-Condition System state:'%s'%n""", originator.getState());

        originator.restoreState(careTaker.getMemento(stateLow));
        System.out.printf("""
                Restored position:'%d', Air-Condition System state:'%s'%n""", stateLow, originator.getState());
    }
}
