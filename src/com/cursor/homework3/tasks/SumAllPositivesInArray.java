package com.cursor.homework3.tasks;

import com.cursor.homework3.Task;

import java.util.Arrays;

public class SumAllPositivesInArray implements Task {

    Number[] arr;

    public SumAllPositivesInArray() {
        arr = new Number[]{1, 3, 7, -9, 15};
    }


    @Override
    public void executeTask() {
        System.out.println("TASK 5");
        System.out.println("Got an array of numbers:" + Arrays.toString(arr));
        System.out.println("Sum of positives =" + sumAllPositives(arr));
    }

    private double sumAllPositives(Number[] array) {

        double result = 0;
        for (Number n : arr) {
            if (n.doubleValue() > 0)
                result += n.doubleValue();
        }
        return result;
    }
}

