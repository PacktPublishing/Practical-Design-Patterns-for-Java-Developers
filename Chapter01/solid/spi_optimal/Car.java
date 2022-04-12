public class Car implements HasEngine, Vehicle {
    private boolean moving;

    public void setMove(boolean moving) {
        this.moving = moving;
    }

    public boolean engineOn() {
        return moving;
    }
}
