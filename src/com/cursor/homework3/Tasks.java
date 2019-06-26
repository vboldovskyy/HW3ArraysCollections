package com.cursor.homework3;

// i put all the methods in one file for the sake of ease of review.

import java.util.*;
import java.util.stream.Collectors;

public class Tasks {

    public static void task2() {
        System.out.println("TASK 2 \nWhy arrays in java initialized with fixed size and cant be dynamic?\n " +
                "The simplest answer to this question is BY DEFINITION. As we see in official Oracle javadoc: \n" +
                "\"An array is a container object that holds a fixed number of values of a single type. The length of\n" +
                "an array is established when the array is created. After creation, its length is fixed.\"\n" +
                "Generally, the first reason is performance: an array is a low-level structure with very fast by-index \n" +
                " access. So it reserves the needed amount of memory at creation and carries property length, which \n" +
                "indicates the number of indices available, as you can address to an array element by index only. \n" +
                "also, i think Array was implemented so for legacy reasons, with the need of developers of C-style arrays.\n" +
                "generally, if you need a dynamic array, feel free to use Arrays.copyOf() or List collection.\n");
    }

    public static Integer[] task3() {
        System.out.println("TASK 3");
        Integer[] intArray = {2, 3, 1, 7, 11};
        System.out.println("Integer array before: " + Arrays.toString(intArray));
        Arrays.sort(intArray, Comparator.reverseOrder());
        System.out.println("Integer array after: " + Arrays.deepToString(intArray));
        return intArray;
    }

    public static List<String> task4() {
        System.out.println("TASK 4");
        List<String> list = new ArrayList<>(Arrays.asList("One", "Two", "Tree", "Four"));
        System.out.println("ArrayList contains: " + list.toString());
        //don't even think about iterating by index, so decided to use streams
        list = list.stream().map(a -> a.equals("Tree") ? "Three" : a).collect(Collectors.toList());
        System.out.println("Now ArrayList Contains: " + list.toString());
        return list;
    }

    public static double task5(Number[] arr) {
        System.out.println("TASK 5");
        System.out.println("Got an array of numbers:" + Arrays.toString(arr));
        double result = 0;
        for (Number n : arr) {
            if (n.doubleValue() > 0)
                result += n.doubleValue();
        }
        System.out.println("Sum of positives =" + result);
        return result;
    }

    public static double task6(Number[] arr) {
        System.out.println("TASK 6");
        System.out.println("Got an array of numbers: " + Arrays.toString(arr));
        double result = 0;
        for (Number n : arr)
            result += n.doubleValue() / arr.length;
        System.out.println("The average of an array is " + result);
        return result;

    }

    public static List<Integer> task7() {
        System.out.println("TASK 7");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 9, 11, 18, 20, 22));
        System.out.println("Got a list of numbers: " + list.toString());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0) {
                list.remove(i);
                i--;  //essential to get the loop correct;
            }
        }
        System.out.println("Now list contains: " + list.toString());
        return list;
    }

    public static List<Integer> task7alternate() {

        System.out.println("TASK 7 (alternative)");
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 9, 11, 18, 20, 22));
        System.out.println("Got a list of numbers: " + list.toString());
        list = list.stream().filter(a -> a % 3 != 0).collect(Collectors.toList());
        System.out.println("Now list contains: " + list.toString());
        return list;
    }

}
