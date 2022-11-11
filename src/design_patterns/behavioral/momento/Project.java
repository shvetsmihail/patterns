package design_patterns.behavioral.momento;

public class Project {
    private String version;
    private String data;

    private final Repository repository;

    public Project(String version, String data, Repository repository) {
        this.version = version;
        this.data = data;
        this.repository = repository;
    }

    public void addChanges(String data) {
        this.data = data;
    }

    public void commit(String version) {
        this.version = version;
        repository.save(new Save(version, data));
    }

    public void rollBack(String version) {
        Save save = repository.load(version);
        if (save != null) {
            this.version = save.getVersion();
            this.data = save.getData();
        }
    }

    @Override
    public String toString() {
        return "Project{" +
                "version='" + version + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
