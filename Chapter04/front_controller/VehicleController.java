class VehicleController {
    private final RequestDispatcher dispatcher;
    private boolean authorised;

    VehicleController() {
        this.dispatcher = new RequestDispatcher(new BreaksUnit(), new EngineUnit());
    }

    private boolean isAuthorized() {
        System.out.println("VehicleController, is authorized");
        return authorised;
    }

    private void logRequest(String request) {
        System.out.printf("""
                VehicleController, log:'%s'%n""", request);
    }

    void authorise() {
        System.out.println("VehicleController, authorization");
        authorised = true;
    }

    void processRequest(String request) {
        logRequest(request);
        if (isAuthorized()) {
            dispatcher.dispatch(request);
        } else {
            System.out.printf("""
                VehicleController, not authorised request:'%s'%n""", request);
        }
    }
}
