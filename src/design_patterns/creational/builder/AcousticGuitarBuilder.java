package design_patterns.creational.builder;

public class AcousticGuitarBuilder extends AbstractGuitarBuilder {
    @Override
    void buildType() {
        guitar.setType(Type.ACOUSTIC);
    }

    @Override
    void buildPrice() {
        guitar.setPrice(100);
    }
}
