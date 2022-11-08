class VehicleSystemCheckVisitor implements  CheckVisitor{

    @Override
    public void visit(EngineCheck engineCheck) {
        System.out.println("EngineCheck, ready");
        visitBySwitch(engineCheck);
    }

    @Override
    public void visit(SuspensionCheck suspensionCheck) {
        System.out.println("SuspensionCheck, ready");
        visitBySwitch(suspensionCheck);
    }

    @Override
    public void visit(BreaksCheck breaksCheck) {
        System.out.println("BreakCheck, ready");
        visitBySwitch(breaksCheck);
    }

    @Override
    public void visit(VehicleCheck vehicleCheck) {
        System.out.println("VehicleCheck, ready");
        visitBySwitch(vehicleCheck);
    }


    private void visitBySwitch(SystemCheck systemCheck){
        switch (systemCheck){
            case EngineCheck e -> System.out.println("EngineCheck, ready, double-check, " + e);
            case SuspensionCheck s -> System.out.println("SuspensionCheck, ready, double-check, " + s);
            case BreaksCheck b -> System.out.println("BreakCheck, ready, double-check, " + b);
            case VehicleCheck v -> System.out.println("VehicleCheck, ready, double-check, " + v);
            case null -> System.out.println("VehicleSystemCheckVisitor, not allowed");
            default -> System.out.println("VehicleSystemCheckVisitor, not implemented");
        }
    }
}
