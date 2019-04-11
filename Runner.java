package edu.dmacc.codedsm.hw17;

import edu.dmacc.codedsm.hw17.objects.*;

import java.util.ArrayList;
import java.util.List;


public class Runner {

    public static void main(String[] args) {
        System.out.println("Starting runner...");

        User assigner = new User("Nate","Buwalda","DMACC");
        User assignee = new User("James","Kabera","5156391706");
        Task task = new Task("Homework17",1, assigner, assignee);
        List<User> listOfUsers = new ArrayList<>();
        TaskInPerson taskInPerson = new TaskInPerson();
        taskInPerson.performTask(task,assignee);
        TaskAtTheOffice taskAtTheOffice = new TaskAtTheOffice();
        taskAtTheOffice.performTask(task,assignee);
        taskAtTheOffice.performTask(task, listOfUsers);
        TaskForTrainee taskForTrainee = new TaskForTrainee();
        taskForTrainee.performTask(task, listOfUsers);
    }

}
