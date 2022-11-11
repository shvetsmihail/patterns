package design_patterns.creational.factoryMethod;

public interface Developer {
    default void introduce() {
        System.out.println("I am " + this.getClass().getSimpleName());
    }
}
