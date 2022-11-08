public class BreaksCheck implements SystemCheck {
    @Override
    public void accept(CheckVisitor visitor) {
        visitor.visit(this);
    }
}
