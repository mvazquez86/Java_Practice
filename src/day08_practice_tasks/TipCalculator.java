package day08_practice_tasks;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No Split");
        String split = input.next();

        System.out.println("Enter the number of people");
        int people = input.nextInt();

        System.out.println("Enter the check amount");
        double billAmount = input.nextDouble();

        System.out.println("Service quality");
        String quality = input.next();

        input.close();

        double tip = 0;
        double total = billAmount / people;
        if (split.equals("yes")) {

            switch (quality) {
                case "poor" -> tip = total * .05;
                case "fair" -> tip = total * .10;
                case "good" -> tip = total * .15;
                case "great" -> tip = total * .20;
                case "excellent" -> tip = total * .25;
                default -> System.out.println("Wrong input, start again");
            }
        } else {
            switch (quality) {

                case "poor" -> tip = billAmount * .05;
                case "fair" -> tip = billAmount * .10;
                case "good" -> tip = billAmount * .15;
                case "great" -> tip = billAmount * .20;
                case "excellent" -> tip = billAmount * .25;
                default -> System.out.println("Wrong input, start again");
            }
        }

        System.out.println("Number of people entered: "+people);
        System.out.println("Total to pay: "+ (billAmount+tip*people));
        System.out.println("Total tip:" +(tip*people));
        System.out.println("Total per person: "+ (tip+total));
        System.out.println("Tip per person: "+tip);

    }
}
