package design_patterns.behavioral.chain;

import java.util.List;

public abstract class Worker {
    private final List<TaskType> taskTypes;
    private Worker nextWorker;

    public Worker(List<TaskType> taskTypes) {
        this.taskTypes = taskTypes;
    }

    public void setNextWorker(Worker nextWorker) {
        this.nextWorker = nextWorker;
    }

    public void handleTask(Task task) {
        if (taskTypes.contains(task.getTaskType())) {
            doJob(task);
        }

        if (nextWorker != null) {
            nextWorker.handleTask(task);
        }
    }

    protected abstract void doJob(Task task);
}
