package design_patterns.behavioral.momento;

import java.util.Date;

public class Save {
    private final String version;
    public final String data;

    public Save(String version, String data) {
        this.version = version;
        this.data = data;
    }

    public String getVersion() {
        return version;
    }

    public String getData() {
        return data;
    }
}
