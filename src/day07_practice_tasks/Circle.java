package day07_practice_tasks;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter the radius");
        double radius = input.nextDouble();

        System.out.println("The area of the circle is " + (3.14 * radius * radius));
        System.out.println("The perimeter of the circle is " + (3.14*(radius+radius)));


    }
}
