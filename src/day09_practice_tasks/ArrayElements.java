package day09_practice_tasks;

import java.util.Arrays;

public class ArrayElements {

    public static void main(String[] args) {

        int[] elements = new int[100];

        for (int i = 0; i < elements.length; i++) {
            elements[i] = i+1;
            System.out.print(elements[i]+ " ");
        }
        //System.out.println(Arrays.toString(elements));
        System.out.println("");

        for (int i = elements.length - 1; i >= 0; i--) {
            System.out.print(elements[i]+ " ");
        }
        System.out.println(Arrays.toString(elements));


        for (int i = 0; i < elements.length; i++) {

            if (elements[i] % 5 == 0) {
                System.out.print(elements[i] + " ");
            }
        }
    }
}
