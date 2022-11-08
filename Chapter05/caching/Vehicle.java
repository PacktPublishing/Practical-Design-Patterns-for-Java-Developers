class Vehicle {
    private final SystemCache cache = new SystemCache(3);

    void init(){
        cache.addSystem(new BreakSystem("break"));
        cache.addSystem(new EngineSystem("engine"));
        System.out.println("Vehicle, init cache:" + systemTypes());
    }

    void addSystem(VehicleSystem s){
        if(!cache.addSystem(s)){
            System.err.println("SystemCache, not stored:" + s);
        }
    }

    String systemTypes(){
        return cache.getSystemTypes();
    }

    VehicleSystem getSystemByType(String type){
        return  cache.getSystem(type);
    }

}
