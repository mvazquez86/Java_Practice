package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 7));

        ArrayList<Integer> output = new ArrayList<>();

        for (Integer i : list) {

            if (!output.contains(i)) {
                output.add(i);
            }

        }
        System.out.println(output);
    }
}




