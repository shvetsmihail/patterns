package design_patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {

    private Map<String, Developer> map = new HashMap<>();

    public Developer getDeveloperBySpeciality(String speciality) {
        Developer developer = map.get(speciality);
        if (developer == null) {
            switch (speciality) {
                case "java":
                    developer = new JavaDev();
                    break;
                case "js":
                    developer = new JSDev();
                    break;
                default:
                    developer = new FullStackDev();

            }
            System.out.println("Hiring " + developer.getClass().getSimpleName());
            map.put(speciality, developer);
        }

        return developer;
    }
}
