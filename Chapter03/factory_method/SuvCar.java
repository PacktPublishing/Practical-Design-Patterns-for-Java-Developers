record SuvCar(String type) implements Vehicle {
    @Override
    public void move() {
        System.out.println("""
            SuvCar, type:'%s', move""".formatted(type));   
    }    
}
