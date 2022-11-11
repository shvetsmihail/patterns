package design_patterns.behavioral.chain;

import java.util.List;

public class PM extends Worker{
    public PM(List<TaskType> taskTypes) {
        super(taskTypes);
    }

    @Override
    protected void doJob(Task task) {
        System.out.println("managing task" + task.getTitle());
    }
}
