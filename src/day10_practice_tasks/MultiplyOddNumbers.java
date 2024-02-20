package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyOddNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));

        ArrayList<Integer> output = new ArrayList<>();

        for (Integer i : list) {
           if(i%2 != 0){
               output.add(i*2);
           }else{
               output.add(i);
           }
        }
        System.out.println(output);
    }
}
