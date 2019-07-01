package com.cursor.homework3.com.cursor.homework3.tasks;

import com.cursor.homework3.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterListByDivisibility implements Task {

    List<Integer> intList;

    public FilterListByDivisibility() {
        intList = new ArrayList<>(Arrays.asList(3, 9, 11, 18, 20, 22));
    }


    @Override
    public void executeTask() {
        System.out.println("TASK 7 (alternative)");
        System.out.println("Got a list of numbers: " + intList);
        intList = filterOutDivisibleByThree(intList);
        System.out.println("Now list contains: " + intList);
    }

    private List<Integer> filterOutDivisibleByThree(List<Integer> list) {
        return list.stream().filter(a -> a % 3 != 0).collect(Collectors.toList());
    }
}
