class ObjectPoolMain {
    public static void main(String[] args) {
        System.out.println("Pattern Object Pool: vehicle garage");
        var garage = new PooledVehicleGarage();
        var vehicle1 = garage.driveVehicle();
        var vehicle2 = garage.driveVehicle();
        var vehicle3 = garage.driveVehicle();
        vehicle1.move();
        vehicle2.move();
        vehicle3.move();
        garage.returnVehicle(vehicle1);
        garage.returnVehicle(vehicle3);
        garage.printStatus();
        var vehicle4 = garage.driveVehicle();
        var vehicle5 = garage.driveVehicle();
        vehicle4.move();
        vehicle5.move();
        garage.printStatus();    
    }
    
}
