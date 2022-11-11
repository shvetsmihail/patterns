package design_patterns.structural.composition;

import java.util.ArrayList;
import java.util.List;

public class PM implements Developer {
    List<Developer> developers = new ArrayList<>();

    public void addDev(Developer developer) {
        developers.add(developer);
    }

    public void addRemove(Developer developer) {
        developers.remove(developer);
    }

    @Override
    public void writeCode() {
        developers.forEach(Developer::writeCode);
    }
}
