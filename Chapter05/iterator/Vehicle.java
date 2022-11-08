sealed interface Vehicle permits StandardVehicle {
    PartsIterator getParts();
}
