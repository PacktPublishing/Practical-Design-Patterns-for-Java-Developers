class IntegerExpression implements Expression{
    private final int value;

    IntegerExpression(String value) {
        this.value = Integer.parseInt(value);
    }

    @Override
    public int interpret() {
        return value;
    }
}
