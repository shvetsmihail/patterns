package design_patterns.behavioral.chain;

public class Task {
    private String title;
    private TaskType taskType;

    public Task(String title, TaskType taskType) {
        this.title = title;
        this.taskType = taskType;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public String getTitle() {
        return title;
    }
}
