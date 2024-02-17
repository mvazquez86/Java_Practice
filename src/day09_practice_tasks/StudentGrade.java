package day09_practice_tasks;

import java.util.Arrays;

public class StudentGrade {

    public static void main(String[] args) {

        String[] studentNames = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90,75,80};
        char[] grades = new char[3];

        for (int i = 0; i < scores.length; i++) {

            if(scores[i]>=90){
                grades[i] = 'A';
            }else if(scores[i]>=80){
                grades[i] = 'B';
            }else{
                grades[i] = 'C';
            }

            System.out.println(studentNames[i]+"'"+"s score is "+scores[i]+", and grade is "+ grades[i]);
        }
       // System.out.println(grades);
        }
    }

