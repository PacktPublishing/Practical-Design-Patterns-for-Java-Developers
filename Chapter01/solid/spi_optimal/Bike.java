public class Bike implements HasPedals, Vehicle {
    private boolean moving;

    public void setMove(boolean moving) {
        this.moving = moving;
    }

    public boolean pedalsMove() {
        return moving;
    }
}
