final class PetrolEngine implements Engine {
    @Override
    public void run() {
        System.out.println("PetrolEngine, run");
    }

    @Override
    public void tank() {
        System.out.println("PetrolEngine, tank");
    }
}
