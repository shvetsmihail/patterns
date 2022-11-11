package design_patterns.creational.factoryMethod;

public class JavaDevCreator implements DeveloperCreator{
    @Override
    public Developer createDeveloper() {
        return new JavaDev();
    }
}
