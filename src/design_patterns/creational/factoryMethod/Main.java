package design_patterns.creational.factoryMethod;

public class Main {
    public static void main(String[] args) {
        DeveloperCreator developerCreator = new JavaDevCreator();
        developerCreator.createDeveloper().introduce();

        developerCreator = new JSDevCreator();
        developerCreator.createDeveloper().introduce();
    }
}
