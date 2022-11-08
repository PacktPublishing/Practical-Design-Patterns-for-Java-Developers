final class TransmissionSystem extends VehicleSystem{

    TransmissionSystem() {
        super(SystemType.TRANSMISSION);
    }

    @Override
    void activate() {
        System.out.println("TransmissionSystem: activated");
    }
}
