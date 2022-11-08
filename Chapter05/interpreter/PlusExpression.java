class PlusExpression implements Expression {

    private final Expression temp1;
    private final Expression temp2;

    PlusExpression(Expression temp1, Expression temp2) {
        this.temp1 = temp1;
        this.temp2 = temp2;
    }

    @Override
    public int interpret() {
        return temp1.interpret() + temp2.interpret();
    }
}
