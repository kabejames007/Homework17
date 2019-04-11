package edu.dmacc.codedsm.hw17.objects;

import java.util.List;

public class TaskPerformer {
    public void performTask(Task task, User user){
        System.out.println("This method was called from the subclass TaskPerformer");

    }

    public void performTask(Task task, List<User> users){
        System.out.println("This method was called from the subclass TaskPerformer");

    }
}
