package design_patterns.creational.abstratfactory;

import design_patterns.creational.abstratfactory.Developer;

public class JavaDev implements Developer {
    @Override
    public void develop() {
        System.out.println("java dev");
    }
}
