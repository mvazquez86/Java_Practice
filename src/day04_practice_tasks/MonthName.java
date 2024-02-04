package day04_practice_tasks;

public class MonthName {

    public static void main(String[] args) {

        int num = 7;

        String month = switch (num){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "no such month";
        };

        System.out.println(month);
    }
}
