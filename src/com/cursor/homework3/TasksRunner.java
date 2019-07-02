package com.cursor.homework3;

import com.cursor.homework3.tasks.*;

import java.util.ArrayList;
import java.util.List;


 class TasksRunner {

    private List<Task> tasksList;

        TasksRunner() {
        tasksList = new ArrayList<>();
        tasksList.add(new SortDescending());
        tasksList.add(new ReplacingInAList());
        tasksList.add(new SumAllPositivesInArray());
        tasksList.add(new AverageOfAnArray());
        tasksList.add(new FilterListByDivisibility());
    }

    void runAllTasks() {
        for (Task task : tasksList) {
            task.executeTask();
        }
    }

}
