package day07_practice_tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Enter your gender");
        String gender = input.next();

        System.out.println("Enter your full name");
        input.nextLine();
        String name = input.nextLine();

        System.out.println("Enter your phone number");
        long phone = input.nextLong();

        System.out.println("Enter your zip code");
        int zip = input.nextInt();

        System.out.println("Enter your school name");
        input.nextLine();
        String school = input.nextLine();

        System.out.println("Enter your city");
        String city = input.nextLine();

        System.out.println("Enter your state");
        String state = input.next();

        System.out.println("Enter your building number");
        int bldg = input.nextInt();

        System.out.println("Enter the street name");
        input.nextLine();
        String street = input.nextLine();

        System.out.println(name +"\n"+age+"\n"+gender+"\n"+phone+"\n"+"Address:"+"\n\t"+bldg+ " "+street+ "\n\t" + city +", " +state+ " "+ zip);
    }
}
