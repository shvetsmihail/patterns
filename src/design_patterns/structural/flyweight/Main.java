package design_patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> devs = new ArrayList<>();
        devs.add(developerFactory.getDeveloperBySpeciality("java"));
        devs.add(developerFactory.getDeveloperBySpeciality("java"));
        devs.add(developerFactory.getDeveloperBySpeciality("java"));
        devs.add(developerFactory.getDeveloperBySpeciality("java"));
        devs.add(developerFactory.getDeveloperBySpeciality("java"));
        devs.add(developerFactory.getDeveloperBySpeciality("java"));
        devs.add(developerFactory.getDeveloperBySpeciality("js"));
        devs.add(developerFactory.getDeveloperBySpeciality("js"));
        devs.add(developerFactory.getDeveloperBySpeciality("js"));
        devs.add(developerFactory.getDeveloperBySpeciality("js"));
        devs.add(developerFactory.getDeveloperBySpeciality("js"));
        devs.add(developerFactory.getDeveloperBySpeciality("python"));
        devs.add(developerFactory.getDeveloperBySpeciality("python"));
        devs.add(developerFactory.getDeveloperBySpeciality("python"));
        devs.add(developerFactory.getDeveloperBySpeciality("python"));

        devs.forEach(Developer::writeCode);
    }
}
