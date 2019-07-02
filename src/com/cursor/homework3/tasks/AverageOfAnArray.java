package com.cursor.homework3.tasks;

import com.cursor.homework3.Task;

import java.util.Arrays;

public class AverageOfAnArray implements Task {

    private Number[] arr;

    public AverageOfAnArray() {

        arr = new Number[]{1, 7, 28, -14, 9};
    }

    public void executeTask() {
        System.out.println("TASK 6");
        System.out.println("Got an array of numbers: " + Arrays.toString(arr));
        System.out.println("Its average equals " + calculateAverage(arr));
    }

    private double calculateAverage(Number[] array) {

        double result = 0;
        for (Number n : array)
            result += n.doubleValue() / array.length;

        return result;
    }
}
