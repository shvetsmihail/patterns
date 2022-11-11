package design_patterns.behavioral.interpreter;

public class OrExpression implements Expression {
    private final Expression ex1;
    private final Expression ex2;

    public OrExpression(Expression ex1, Expression ex2) {
        this.ex1 = ex1;
        this.ex2 = ex2;
    }

    @Override
    public boolean interpret(Employee employee) {
        return ex1.interpret(employee) || ex2.interpret(employee);
    }
}
