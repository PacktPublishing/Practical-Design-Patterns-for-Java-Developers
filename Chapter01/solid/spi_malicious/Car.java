public class Car implements Vehicle {
    private boolean moving;
    public void setMove(boolean moving) {
        this.moving = moving;
    }
    public boolean engineOn() {
        return moving;
    }
    public boolean pedalsMove() {
        throw new IllegalStateException("not supported");
    }
}
