package day09_practice_tasks;

import java.util.Arrays;

public class GroceryItems {

    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        for (int i = 0; i < items.length; i++) {

            for (int j = 0; j <= items[i].length-1; j++) {
                String name = items[i][j];
                System.out.print(name+"\t\t");
            }
            System.out.println();
        }

        System.out.println("=======================");

        for (int i = 0; i < items.length; i++) {

            for (int j = items[i].length - 1; j >= 0; j--) {
                String name = items[i][j];
                System.out.print(name+"\t\t");
            }
            System.out.println();
        }


        System.out.println("========================");

        for (int i = items.length - 1; i >= 0; i--) {

            for (int j = 0; j < items[i].length; j++) {
                String name = items[i][j];
                System.out.print(name+"\t\t");
            }
            System.out.println();
        }
    }

}


