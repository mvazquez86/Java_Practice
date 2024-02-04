package day04_practice_tasks;

public class MedianNumber {

    //NEED TO  CORRECT!!!!!

    public static void main(String[] args) {

        int a,b,c;
        a=15;
        b=10;
        c=15;

        int median = (a+b+c)/3;

        if (a!=b && b!=c) {
            System.out.println(median + " is the median number");
        }

        else {
            System.out.println("numbers need to be different");
        }
    }
}
