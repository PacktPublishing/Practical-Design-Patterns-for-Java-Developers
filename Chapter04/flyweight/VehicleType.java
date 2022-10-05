record VehicleType(String type) implements Vehicle{
    @Override
    public void confirm() {
        System.out.printf("""
                Vehicle, type:'%s', confirmed%n""", type);
    }
}
