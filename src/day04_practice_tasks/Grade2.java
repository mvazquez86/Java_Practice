package day04_practice_tasks;

public class Grade2 {

    public static void main(String[] args) {

        char grade = 'x';

        switch(grade){

            case 'a'-> System.out.println("Excellent");
            case 'b'-> System.out.println("Good job");
            case 'c'-> System.out.println("Good");
            case 'd'-> System.out.println("Passed");
            case 'f'-> System.out.println("Failed");
            default-> System.out.println("Invalid Grade");
        }

    }
}
