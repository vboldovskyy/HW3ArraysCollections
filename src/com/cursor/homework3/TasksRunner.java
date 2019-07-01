package com.cursor.homework3;

// i put all the methods in one file for the sake of ease of review.

import com.cursor.homework3.com.cursor.homework3.tasks.*;

import java.util.*;
import java.util.stream.Collectors;

public class TasksRunner {

    List<Task> tasksList;

    public TasksRunner() {
        tasksList = new ArrayList<>();
        tasksList.add(new SortDescending());
        tasksList.add(new ReplacingInAList());
        tasksList.add(new SumAllPositivesInArray());
        tasksList.add(new AverageOfAnArray());
        tasksList.add(new FilterListByDivisibility());
    }

    public void runAllTasks() {
        for (Task task : tasksList) {
            task.executeTask();
        }
    }

}
