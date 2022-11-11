package design_patterns.creational.builder;

public class Director {
    private AbstractGuitarBuilder abstractGuitarBuilder;

    public Director(AbstractGuitarBuilder abstractGuitarBuilder) {
        this.abstractGuitarBuilder = abstractGuitarBuilder;
    }

    public Guitar buildGuitar() {
        abstractGuitarBuilder.createGuitar();
        abstractGuitarBuilder.buildPrice();
        abstractGuitarBuilder.buildType();
        return abstractGuitarBuilder.getGuitar();
    }


}
