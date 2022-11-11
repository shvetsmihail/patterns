package design_patterns.creational.builder;

public abstract class AbstractGuitarBuilder {
    protected Guitar guitar;

    public void createGuitar() {
        guitar = new Guitar();
    }

    abstract void buildType();
    abstract void buildPrice();

    public Guitar getGuitar() {
        return guitar;
    }
}
