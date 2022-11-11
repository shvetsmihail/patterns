package design_patterns.behavioral.chain;

import java.util.List;

public class QA extends Worker {
    public QA(List<TaskType> taskTypes) {
        super(taskTypes);
    }

    @Override
    protected void doJob(Task task) {
        System.out.println("testing task" + task.getTitle());
    }
}
