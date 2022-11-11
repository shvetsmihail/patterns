package design_patterns.creational.builder;

public class ElectricGuitarBuilder extends AbstractGuitarBuilder {
    @Override
    void buildType() {
        guitar.setType(Type.ELECTRIC);
    }

    @Override
    void buildPrice() {
        guitar.setPrice(200);
    }
}
