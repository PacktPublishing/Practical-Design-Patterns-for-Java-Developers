import java.util.concurrent.TimeUnit;

class ActiveObjectMain {
    public static void main(String[] args) throws Exception {
        System.out.println("Active Object Pattern, moving vehicle");
        var sportVehicle = new SportVehicle("super_sport");
        sportVehicle.move();
        sportVehicle.turnOnRadio();
        sportVehicle.turnOffRadio();
        sportVehicle.turnOnRadio();
        sportVehicle.stopVehicle();
        sportVehicle.turnOffRadio();
        TimeUnit.MILLISECONDS.sleep(400);
        System.out.println("ActiveObjectMain, sportVehicle moving:" + sportVehicle.isMoving());
    }
}
