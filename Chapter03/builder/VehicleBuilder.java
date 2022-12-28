final class VehicleBuilder {
    static  Vehicle buildSlowVehicle(){
        var engine = new RecordPart("engine");
        var cabin = new StandardPart("cabin");
        return new SlowVehicle(engine, cabin);
    }   
}
