package day07_practice_tasks;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score");
        double score = input.nextDouble();

        String message = " ";

        if (score>100 || score<0){
            message = "Invalid Score";
        } else if (score>=90){
            message = "Your grade is A";
        } else if (score >= 80) {
            message = "Your grade is B";
        }else if (score >= 70){
            message = "Your grade is C";
        }else if (score >=60){
            message = "Your grade is D";
        }else{
            message = "Your grade is F";
        }

        System.out.println(message);

        }

    }

