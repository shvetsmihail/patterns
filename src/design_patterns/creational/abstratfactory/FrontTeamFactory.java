package design_patterns.creational.abstratfactory;

public class FrontTeamFactory implements TeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JSDev();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }
}
