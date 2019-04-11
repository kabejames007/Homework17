package edu.dmacc.codedsm.hw17.objects;

public class TaskInPerson extends TaskPerformer {

    @Override
    public void performTask(Task task, User user) {
        System.out.println("This method was called from the subclass TaskInPerson");
    }
}
