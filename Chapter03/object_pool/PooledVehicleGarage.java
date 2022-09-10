final class PooledVehicleGarage extends AbstractGaragePool<PooledVehicle>{

    @Override
    protected PooledVehicle buyVehicle() {
        return new PooledVehicle();
    }
}
