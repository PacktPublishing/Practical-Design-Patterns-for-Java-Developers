class FastVehicle implements Vehicle {

    final static class Builder {
        private Part engine;
        private Part cabin;
        Builder(){}
       
        Builder addEngine(String e){
            this.engine = new StandardPart(e);
            return this;
        }

        Builder addCabin(String c){
            this.cabin = new RecordPart(c);
            return this;
        }

        FastVehicle build(){
            return new FastVehicle(engine, cabin);
        }
    }

    private final Part engine;
    private final Part cabin;

    FastVehicle(Part engine, Part cabin){
        this.engine = engine;
        this.cabin = cabin;
    }

    @Override
    public void move() {
        System.out.println("FastVehicle, move");
        
    }

    @Override
    public void parts() {
        System.out.println("FastVehicle,engine: " + engine);
        System.out.println("FastVehicle,cabin: " + cabin);
        
    }
}
