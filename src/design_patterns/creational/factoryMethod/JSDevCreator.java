package design_patterns.creational.factoryMethod;

public class JSDevCreator implements DeveloperCreator {
    @Override
    public Developer createDeveloper() {
        return new JSDev();
    }
}
