package design_patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director(new AcousticGuitarBuilder());
        System.out.println(director.buildGuitar());

        director = new Director(new ElectricGuitarBuilder());
        System.out.println(director.buildGuitar());
    }
}
