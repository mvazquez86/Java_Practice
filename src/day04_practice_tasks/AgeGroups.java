package day04_practice_tasks;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 42;

        if (age<0 || age >150){
            System.out.println("Invalid");
        }

        else if (age >=55){
            System.out.println("Senior");
        }

        else if (age>=21){
            System.out.println("Adult");
        }

        else if (age>=0){
            System.out.println("Teenager");
        }

    }
}
