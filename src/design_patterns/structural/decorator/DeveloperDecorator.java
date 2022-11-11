package design_patterns.structural.decorator;

public abstract class DeveloperDecorator implements Developer {
    private final Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void writeCode() {
        developer.writeCode();
    }
}
