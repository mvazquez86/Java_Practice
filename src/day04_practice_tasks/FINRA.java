package day04_practice_tasks;

public class FINRA {

    public static void main(String[] args) {

        int num = 15;

        if (num%3==0 && num%5==0){
            System.out.println("FINRA");
        }

        else if (num %3==0){
            System.out.println("FIN");
        }

        else if (num %5==0){
            System.out.println("RA");
        }

        else {
            System.out.println("number is invalid");
        }
    }
}
