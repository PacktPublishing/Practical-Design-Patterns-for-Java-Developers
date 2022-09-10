record SportCar(String type) implements Vehicle {
    @Override
    public void move() {
        System.out.println("""
            SportCar, type:'%s', move""".formatted(type));   
    }   
}
