package day04_practice_tasks;

public class Calculator {

    public static void main(String[] args) {

        double n1 = 10;
        double n2 = 20;
        char operator = '!';

        switch (operator){

            case '+'-> System.out.println(n1+n2);
            case '-'-> System.out.println(n1-n2);
            case '*'-> System.out.println(n1*n2);
            case '/'-> System.out.println(n2/n1);
            default -> System.out.println("Invalid Operator");
        }
    }
}
