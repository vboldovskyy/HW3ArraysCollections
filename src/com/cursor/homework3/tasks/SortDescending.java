package com.cursor.homework3.tasks;

import com.cursor.homework3.Task;

import java.util.Arrays;
import java.util.Comparator;

public class SortDescending implements Task {

    private static final Integer[] intArray = {2, 3, 1, 7, 11};


    private Integer[] sortReverse(Integer[] array) {
        Arrays.sort(array, Comparator.reverseOrder());
        return array;
    }

    public void executeTask() {
        System.out.println("TASK 3");

        System.out.println("Integer array before: " + Arrays.toString(intArray));
        sortReverse(intArray);
        System.out.println("Integer array after: " + Arrays.toString(intArray));
    }

}
