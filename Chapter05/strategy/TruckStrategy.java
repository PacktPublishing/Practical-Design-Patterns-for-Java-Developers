final class TruckStrategy implements TransportStrategy{
    @Override
    public void transport() {
        System.out.println("Truck, transporting heavy load");
    }
}
