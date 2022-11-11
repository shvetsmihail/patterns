package design_patterns.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Program back = new BackEndProgram(new JavaDev());
        back.developProgram();

        Program front = new FrontEndProgram(new JSDev());
        front.developProgram();
    }
}
