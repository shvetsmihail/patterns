package design_patterns.behavioral.interpreter;

public class TerminalExpression implements Expression {

    private final String skill;

    public TerminalExpression(String skill) {
        this.skill = skill;
    }

    @Override
    public boolean interpret(Employee employee) {
        return employee.getSkills().contains(skill);
    }
}
