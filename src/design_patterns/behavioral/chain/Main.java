package design_patterns.behavioral.chain;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Worker pm = new PM(Arrays.asList(TaskType.BE, TaskType.FE));
        Worker beDev = new BackEndDev(Arrays.asList(TaskType.BE));
        Worker feDev = new FrontEndDev(Arrays.asList(TaskType.FE));
        Worker qa = new QA(Arrays.asList(TaskType.BE, TaskType.FE));

        pm.setNextWorker(beDev);
        beDev.setNextWorker(feDev);
        feDev.setNextWorker(qa);

        Task task1 = new Task("create logic", TaskType.BE);
        Task task2 = new Task("create site", TaskType.FE);

        pm.handleTask(task1);
        pm.handleTask(task2);
    }
}
