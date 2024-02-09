package day08_practice_tasks;

import java.util.Scanner;

public class EmailTask1 {

    public static void main(String[] args) {

       /* Scanner input = new Scanner(System.in);

       System.out.println("enter your first name");
        String name = input.next();

        System.out.println("enter your last name ");
        String lastName = input.next();
        input.close();

        String email1 = name+"_"+lastName+"@gmail.com";
        System.out.println(email1);*/
        String email = "mike_tyson@gmail.com";
        System.out.println(email);

        if (email.contains("_")){
            String firstN = email.substring(0,email.indexOf("_"));
            String lastN = email.substring(email.indexOf("_")+1,email.indexOf("@"));
            String restOf = email.substring(email.indexOf("@"));

            System.out.println(lastN+"_"+firstN+restOf);

        }else{
            System.out.println(email);
        }
     }
}
