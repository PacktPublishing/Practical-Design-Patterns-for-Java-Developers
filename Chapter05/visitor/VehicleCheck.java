class VehicleCheck implements SystemCheck {
    private final SystemCheck[] systems = {new BreaksCheck(), new EngineCheck(), new SuspensionCheck()};

    @Override
    public void accept(CheckVisitor visitor) {
        for (SystemCheck check : systems) {
            check.accept(visitor);
        }
        visitor.visit(this);
    }
}
