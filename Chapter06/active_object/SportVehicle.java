class SportVehicle extends MovingVehicle {
    public SportVehicle(String type) {
        super(type);
    }

    boolean isMoving(){
        return isActive();
    }
}
