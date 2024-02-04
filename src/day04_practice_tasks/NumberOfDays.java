package day04_practice_tasks;

public class NumberOfDays {

    public static void main(String[] args) {

        int num = 11;

        switch (num){

            case 2:
                System.out.println("28 days");
                break;

            case 1,3,5,7,8,10,12:
                System.out.println("31 days");
                break;

            case 4,6,9,11:
                System.out.println("30 days");
                break;

            default:
                System.out.println("Invalid Month");
        }
    }
}
