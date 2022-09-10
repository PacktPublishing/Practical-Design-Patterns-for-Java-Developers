class BuilderMain {
    public static void main(String[] args) {
        System.out.println("Pattern Builder: Vehicle builder 1");    

        var slowCar = VehicleBuilder.buildSlowCar();
        var fastCar = new FastCar.Builder()
                            .addCabin("cabin")
                            .addEngine("Engine")
                            .build();

        slowCar.parts();
        fastCar.parts();
    }
    
}
