package design_patterns.structural.facade;

public class WorkFlow {
    private Developer developer;
    private PM pm;

    public WorkFlow(Developer developer, PM pm) {
        this.developer = developer;
        this.pm = pm;
    }

    public void startSprint(String feature) {
        Task task = pm.createTask(feature);
        developer.doTask(task);
        pm.sendReport();
    }


}
