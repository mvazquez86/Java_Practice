package day09_practice_tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveTheZeros {

    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0};
        int[] sortedArray = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i]!=0){
                // System.out.println("it is zero");
                sortedArray[j]=array[i];
                j++; 
            }
        }

        System.out.println(Arrays.toString(sortedArray));


    }
}
