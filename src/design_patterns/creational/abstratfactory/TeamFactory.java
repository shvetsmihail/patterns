package design_patterns.creational.abstratfactory;

public interface TeamFactory {
    Developer getDeveloper();
    Tester getTester();
}
