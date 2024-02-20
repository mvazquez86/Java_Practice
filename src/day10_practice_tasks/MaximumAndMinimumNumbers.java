package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaximumAndMinimumNumbers {

    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));

        int min = Collections.min(list);
        int max = Collections.max(list);

        System.out.println("Maximum number is "+ max);
        System.out.println("Minimum number is "+ min);

    }
}
