package design_patterns.behavioral.interpreter;

import java.util.List;

public class Employee {
    private final List<String> skills;

    public Employee(List<String> skills) {
        this.skills = skills;
    }

    public List<String> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "skills=" + skills +
                '}';
    }
}
