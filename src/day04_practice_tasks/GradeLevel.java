package day04_practice_tasks;

public class GradeLevel {

    public static void main(String[] args) {

        byte grade = 25;

        if (grade >=1 && grade<=5){
            System.out.println("Elementary School");
        }

        else if (grade >=6 && grade<=8){
            System.out.println("Middle School");
        }

        else if (grade >=9 && grade <=12){
            System.out.println("High School");
        }

        else if (grade >=13 & grade <=16){
            System.out.println("College");
        }

        else if (grade >=17 && grade <=18){
            System.out.println("Grad School");
        }

        else {
            System.out.println("Invalid Grade Level");
        }

    }
}
