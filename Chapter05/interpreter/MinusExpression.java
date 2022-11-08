class MinusExpression implements Expression {
    private final Expression e1;
    private final Expression e2;

    MinusExpression(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    @Override
    public int interpret() {
        return e1.interpret() - e2.interpret();
    }
}
