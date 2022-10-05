class PetrolEngine implements Engine{
    @Override
    public void turnOn() {
        System.out.println("PetrolEngine, on");
    }

    @Override
    public void turnOff() {
        selfCheck();
        System.out.println("PetrolEngine, off");
    }

    private void selfCheck(){
        System.out.println("PetrolEngine, self check");
    }
}
