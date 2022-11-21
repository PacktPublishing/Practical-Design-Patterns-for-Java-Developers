sealed interface Vehicle permits VehicleSingleton, VehicleSingletonChecked {
    String type();
}
