package design_patterns.creational.abstratfactory;

public class Main {
    public static void main(String[] args) {
        ProjectManager backEndPM = new ProjectManager(new BackEndTeamFactory());
        backEndPM.startProject();

        ProjectManager frontEndPM = new ProjectManager(new FrontTeamFactory());
        frontEndPM.startProject();
    }

}
