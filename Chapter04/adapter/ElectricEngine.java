class ElectricEngine implements Engine{
    @Override
    public void run() {
        System.out.println("ElectricEngine, run");
    }

    @Override
    public void tank() {
        System.out.println("ElectricEngine, recharging");
    }

    public void checkPlug(){
        System.out.println("ElectricEngine, check plug");
    }
}
