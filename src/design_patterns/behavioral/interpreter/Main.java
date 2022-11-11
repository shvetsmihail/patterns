package design_patterns.behavioral.interpreter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Expression java = new TerminalExpression("java");
        Expression js = new TerminalExpression("js");
        Expression php = new TerminalExpression("php");
        Expression cpp = new TerminalExpression("c++");

        Expression backEnd = new OrExpression(java, cpp);
        Expression frontEnd = new OrExpression(php, js);
        Expression fullStack = new AndExpression(backEnd, frontEnd);

        List<Employee> employees = Arrays.asList(
                new Employee(Arrays.asList("java", "c++")),
                new Employee(Arrays.asList("js", "java")),
                new Employee(Arrays.asList("php"))
        );

        System.out.println("backEnd:");
        System.out.println(find(employees, backEnd));

        System.out.println("frontEnd:");
        System.out.println(find(employees, frontEnd));

        System.out.println("fullStack:");
        System.out.println(find(employees, fullStack));
    }

    private static List<Employee> find(List<Employee> employees, Expression expression) {
        return employees.stream().filter(expression::interpret).collect(Collectors.toList());
    }
}
