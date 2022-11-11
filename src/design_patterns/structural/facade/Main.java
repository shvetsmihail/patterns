package design_patterns.structural.facade;

public class Main {
    public static void main(String[] args) {
        WorkFlow workFlow = new WorkFlow(new Developer(), new PM());

        workFlow.startSprint("Awesome feature");
    }
}
