package design_patterns.creational.abstratfactory;

public class BackEndTeamFactory implements TeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDev();
    }

    @Override
    public Tester getTester() {
        return new AutoTester();
    }
}
