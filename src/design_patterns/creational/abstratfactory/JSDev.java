package design_patterns.creational.abstratfactory;

import design_patterns.creational.abstratfactory.Developer;

public class JSDev implements Developer {
    @Override
    public void develop() {
        System.out.println("js dev");
    }
}
