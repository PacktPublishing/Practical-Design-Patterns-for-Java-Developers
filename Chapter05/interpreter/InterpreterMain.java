import java.util.Stack;

class InterpreterMain {
    public static void main(String[] args) {
        System.out.println("Pattern Interpreter, math formula evaluation");
        var stack = new Stack<Expression>();
        var formula = "1 - 3 + 100 + 1";
        var parsedFormula = formula.split(" ");

        var index = 0;
        while (index < parsedFormula.length ){
            var text = parsedFormula[index++];
            if(isOperator(text)){
                var leftExp = stack.pop();
                var rightText = parsedFormula[index++];
                var rightExp = new IntegerExpression(rightText);
                var operatorExp = getEvaluationExpression(text, leftExp, rightExp);
                stack.push(operatorExp);
            } else {
                var exp = new IntegerExpression(text);
                stack.push(exp);
            }
        }
        System.out.println("Formula result: " + stack.pop().interpret());
    }

    private static boolean isOperator(String text){
        return text.equals("+") || text.equals("-");
    }

    private static Expression getEvaluationExpression(String operator, Expression left, Expression right){
        return switch (operator){
            case "+" -> new PlusExpression(left, right);
            case "-" -> new MinusExpression(left, right);
            default -> throw new IllegalArgumentException("not implemented");
        };
    }
}
