package design_patterns.behavioral.chain;

import java.util.List;

public class BackEndDev extends Worker {

    public BackEndDev(List<TaskType> taskTypes) {
        super(taskTypes);
    }

    @Override
    protected void doJob(Task task) {
        System.out.println("developing task" + task.getTitle() + " using java");
    }
}
