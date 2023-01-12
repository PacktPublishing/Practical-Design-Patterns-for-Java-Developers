class VehicleController {
    private final RequestDispatcher dispatcher;
    private boolean authorized;

    VehicleController() {
        this.dispatcher = new RequestDispatcher(new BreaksUnit(), new EngineUnit());
    }

    private boolean isAuthorized() {
        System.out.println("VehicleController, is authorized");
        return authorized;
    }

    private void logRequest(String request) {
        System.out.printf("""
                VehicleController, log:'%s'%n""", request);
    }

    void authorize() {
        System.out.println("VehicleController, authorization");
        authorized = true;
    }

    void processRequest(String request) {
        logRequest(request);
        if (isAuthorized()) {
            dispatcher.dispatch(request);
        } else {
            System.out.printf("""
                VehicleController, not authorized request:'%s'%n""", request);
        }
    }
}
