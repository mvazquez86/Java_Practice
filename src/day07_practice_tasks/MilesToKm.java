package day07_practice_tasks;

import java.util.Scanner;

public class MilesToKm {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of miles to convert to km: ");
        double miles = input.nextDouble();

        double km = miles*1.609;

        System.out.println(miles + " miles is equal to "+ km + " kilometers");
    }
}
