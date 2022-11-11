package design_patterns.creational.abstratfactory;

public class ProjectManager {

    private final TeamFactory teamFactory;

    public ProjectManager(TeamFactory teamFactory) {
        this.teamFactory = teamFactory;
    }

    public void startProject() {
        teamFactory.getDeveloper().develop();
        teamFactory.getTester().test();
    }

}
