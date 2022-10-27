sealed interface Engine permits ElectricEngine, PetrolEngine {
    void run();
    void tank();
}
