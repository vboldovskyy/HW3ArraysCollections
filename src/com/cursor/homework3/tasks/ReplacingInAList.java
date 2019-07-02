package com.cursor.homework3.tasks;

import com.cursor.homework3.Task;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReplacingInAList implements Task {

    @Override
    public void executeTask() {

        System.out.println("TASK 4");
        List<String> list = new ArrayList<>(Arrays.asList("One", "Two", "Tree", "Four"));
        System.out.println("ArrayList contains: " + list.toString());
        list = replaceTree(list);
        System.out.println("Now ArrayList Contains: " + list.toString());

    }

    private List<String> replaceTree(List<String> list) {
        return list.stream().map(a -> a.equals("Tree") ? "Three" : a).collect(Collectors.toList());
    }

}
