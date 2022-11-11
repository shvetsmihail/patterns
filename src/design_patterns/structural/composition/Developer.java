package design_patterns.structural.composition;

public interface Developer {
    default void writeCode() {
        System.out.println(this.getClass().getSimpleName() + " writes code");
    }
}
