package design_patterns.behavioral.momento;

import java.util.HashMap;
import java.util.Map;

public class Repository {
    private static final Map<String, Save> storage = new HashMap<>();

    public void save(Save save) {
        storage.put(save.getVersion(), save);
    }

    public Save load(String version) {
        return storage.get(version);
    }
}
