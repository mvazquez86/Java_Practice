package day09_practice_tasks;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] reversedArray = new int[array.length];

        for (int i = reversedArray.length-1, j=0; i >=0 ; i--, j++) {
                reversedArray[i] = array[j];
            }

        System.out.println(Arrays.toString(reversedArray));
        }

    }

