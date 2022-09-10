final class FastCar extends Vehicle {

    FastCar(){
        super("fast car");
    }

    @Override
    void move() {
        System.out.println("""
                %s, move""".formatted(type));  
    }    
}
