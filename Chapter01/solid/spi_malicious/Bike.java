public class Bike implements Vehicle{
    private boolean moving;
    public void setMove(boolean moving) {
        this.moving = moving;
    }
    public boolean engineOn() {
        throw new IllegalArgumentException("not supported");
    }
    public boolean pedalsMove() {
        return moving;
    }
}