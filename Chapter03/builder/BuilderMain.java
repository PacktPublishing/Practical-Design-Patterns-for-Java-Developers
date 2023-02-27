class BuilderMain {
    public static void main(String[] args) {
        System.out.println("Pattern Builder: building vehicles ");    

        var slowVehicle = VehicleBuilder.buildSlowVehicle();
        var fastVehicle = new FastVehicle.Builder()
                            .addCabin("cabin")
                            .addEngine("Engine")
                            .build();
        var superVehicle = new SuperVehicle.Builder()
                            .addCabin("super_cabin")
                            .addEngine("super_engine")
                            .build();

        slowVehicle.parts();
        fastVehicle.parts();
        System.out.println(superVehicle);
        superVehicle.parts();
    }
    
}