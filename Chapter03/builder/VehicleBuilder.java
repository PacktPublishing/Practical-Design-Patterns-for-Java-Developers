final class VehicleBuilder {
    static  Vehicle buildSlowCar(){
        var engine = new RecordPart("engine");
        var cabin = new StandardPart("cabin");
        return new SlowCar(engine, cabin);
    }   
}
