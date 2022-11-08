class VehicleDriver {
    private TransportStrategy strategy;

    VehicleDriver(TransportStrategy strategy) {
        this.strategy = strategy;
    }

    void changeStrategy(TransportStrategy strategy){
        this.strategy = strategy;
    }


    void transport(){
        strategy.transport();
    }

}
