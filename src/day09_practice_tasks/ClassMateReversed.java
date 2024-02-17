package day09_practice_tasks;

import java.util.Arrays;

public class ClassMateReversed {

    public static void main(String[] args) {

        String[] classmates = {"Marcela", "Rosa", "Roman", "Frida", "Gaston", "Romeo", "Remmy",
        "Bruno", "Dante", "Pinky"};


//                                 10
        for (int i = 0; i < classmates.length; i++) {
            String name = classmates[i];
            String reverseName = "";

            for (int c = name.length()-1; c >= 0; c--) {
                reverseName = reverseName + name.charAt(c);

            }
            System.out.println(reverseName);
        }



        }


    }

