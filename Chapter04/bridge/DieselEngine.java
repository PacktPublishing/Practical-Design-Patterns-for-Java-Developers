class DieselEngine implements Engine{
    @Override
    public void turnOn() {
        System.out.println("DieselEngine, on");
    }

    @Override
    public void turnOff() {
        System.out.println("DieselEngine, off");
    }
}
