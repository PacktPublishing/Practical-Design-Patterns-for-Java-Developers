class FastCar implements Vehicle {

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

        FastCar build(){
            return new FastCar(engine, cabin);
        }
    }

    private final Part engine;
    private final Part cabin;

    FastCar(Part engine, Part cabin){
        this.engine = engine;
        this.cabin = cabin;
    }

    @Override
    public void move() {
        System.out.println("FastCar, move");
        
    }

    @Override
    public void parts() {
        System.out.println("FastCar,engine: " + engine);
        System.out.println("FastCar,cabin: " + cabin);
        
    }
}
