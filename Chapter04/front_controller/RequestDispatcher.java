record RequestDispatcher(BreaksUnit breaksUnit, EngineUnit engineUnit) {
    void dispatch(String command) {
        switch (command.toLowerCase()) {
            case "engine" -> engineUnit.start();
            case "breaks" -> breaksUnit.activate();
            default -> throw new IllegalArgumentException("not implemented:" + command);
        }
    }
}
