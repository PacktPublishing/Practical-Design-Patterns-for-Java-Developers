class SlowCar extends Vehicle {
    SlowCar(){
        super("slow car");
    }

    @Override
    void move() {
        System.out.println("""
                %s, move""".formatted(type));  
    }   
}
