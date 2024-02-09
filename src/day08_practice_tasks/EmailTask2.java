package day08_practice_tasks;

import java.sql.SQLOutput;

public class EmailTask2 {

    public static void main(String[] args) {

        String email = "marcela_vazquez@gmail.com";

        String name = email.substring(0,email.indexOf("_"));
        String last = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));


        System.out.println("First name: "+ name.substring(0,1).toUpperCase()+name.substring(1));
        System.out.println("Last Name : "+ last.substring(0,1).toUpperCase()+name.substring(1));
        System.out.println("Domain: "+ domain);
    }
}
