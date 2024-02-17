package day09_practice_tasks;

import java.util.Arrays;

public class ClassMatesInitials {

    public static void main(String[] args) {

        String[] classmates = new String[10];

        classmates[0] = "Marcela Vazquez";
        classmates[1] = "Remmy Valenzuela";
        classmates[2] = "Gaston Valdez";
        classmates[3] = "Roman Ramos";
        classmates[4] = "Ramon Ramos";
        classmates[5] = "Andrea Under";
        classmates[6] = "Ernesto Villalobos";
        classmates[7] = "Isabella Salgado";
        classmates[8] = "Frida Kahlo";
        classmates[9] = "Diego Rivera";

        for (int i = 0; i < classmates.length; i++) {
            System.out.println(classmates[i].charAt(0)+ " " + classmates[i].charAt(classmates[i].indexOf(" ")+1));


        }

            }
        }
/*public static String[] findInitials(String[] names){

        String[] initials = new String[names.length];

        for (int i = 0; i < names.length; i++) {

            String eachName = names[i];
            initials[i] = names[i].charAt(0) + "" +  names[i].charAt(names[i].indexOf(" ")+1);
        }
        //System.out.println(Arrays.toString(initials));

        return initials;
    }*/

