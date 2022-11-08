class StateMain {
    public static void main(String[] args) {
        System.out.println("State Pattern, vehicle turn on states");
        var vehicle = new Vehicle("truck");
        System.out.println("Vehicle state1:" + vehicle.getState());

        var initState = new InitState();
        var startState = new StartState();
        var stopState = new StopState();

        vehicle.setState(initState);
        System.out.println("Vehicle state2:" + vehicle.getState());
        vehicle.setState(startState);
        System.out.println("Vehicle state3:" + vehicle.getState());
        vehicle.setState(stopState);
        System.out.println("Vehicle state4:" + vehicle.getState());

    }
}
