package day07_practice_tasks;

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many cents do you have?");
        int cents = input.nextInt();
        int dollars = cents/100;
        int remaining = cents - (dollars * 100);

        System.out.println(cents + " cents is equal to " + dollars + " dollars and " + remaining + " cents");
    }
}
