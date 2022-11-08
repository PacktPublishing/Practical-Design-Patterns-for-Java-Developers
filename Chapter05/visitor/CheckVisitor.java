interface CheckVisitor {
    void visit(EngineCheck engineCheck);

    void  visit(SuspensionCheck suspensionCheck);

    void visit(BreaksCheck breaksCheck);

    void  visit(VehicleCheck vehicleCheck);
}
