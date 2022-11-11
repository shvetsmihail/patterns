package design_patterns.structural.bridge;

public class FrontEndProgram extends Program {
    public FrontEndProgram(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("FrontEnd in progress");
        developer.writeCode();
    }
}
