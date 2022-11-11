package design_patterns.structural.facade;

public class PM {
    public Task createTask(String feature) {
        System.out.println("Create task " + feature);
        return new Task(feature);
    }

    public void sendReport() {
        System.out.println("Sending report");
    }
}
