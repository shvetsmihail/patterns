package design_patterns.structural.facade;

public class Developer {
    public void doTask(Task task) {
        System.out.println("Task " + task.getTitle() + " in  progress");
    }
}
