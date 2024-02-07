package day07_practice_tasks;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Product name");
        String productName = input.nextLine();

        System.out.println("Enter the price");
        double price = input.nextDouble();

        System.out.println("Enter the qty");
        int qyt = input.nextInt();

        System.out.println("What is your first name?");
        String cxName = input.next();

        System.out.println(cxName + ", your order for "+ qyt+ " " + productName +" has been placed. Your total is "+
                qyt*price);
    }
}
