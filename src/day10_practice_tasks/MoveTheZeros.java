package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveTheZeros {

    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList <Integer> output = new ArrayList<>();

        for (Integer i : list) {
            if (i!=0){
                output.add(i);
            }
        }

        for(Integer i : list){
            if (i==0){
                output.add(i);
            }
        }

        System.out.println(output);
    }
}
