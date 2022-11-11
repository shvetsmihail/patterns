package design_patterns.creational.abstratfactory;

import design_patterns.creational.abstratfactory.Tester;

public class AutoTester implements Tester {
    @Override
    public void test() {
        System.out.println("auto tester");
    }
}
