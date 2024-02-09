package day08_practice_tasks;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class FirstLastName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String name = input.next();

        System.out.println("Enter your last name");
        String last = input. next();

        input.close();




        System.out.print((name.substring(0,1).toUpperCase())+name.substring(1).toLowerCase()
                + " " +(last.substring(0,1).toUpperCase())+last.substring(1).toLowerCase());

    }
}
