class BuilderMain {
    public static void main(String[] args) {
        System.out.println("Pattern Builder: building vehicles ");    

        var slowVehicle = VehicleBuilder.buildSlowVehicle();
        var fastVehicle = new FastVehicle.Builder()
                            .addCabin("cabin")
                            .addEngine("Engine")
                            .build();

        slowVehicle.parts();
        fastVehicle.parts();
    }
    
}
