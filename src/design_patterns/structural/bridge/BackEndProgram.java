package design_patterns.structural.bridge;

public class BackEndProgram extends Program {
    public BackEndProgram(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("BackEnd in progress");
        developer.writeCode();
    }
}
