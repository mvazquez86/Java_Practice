package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLettters {

    public static void main(String[] args) {

            ArrayList<Character> list = new ArrayList<>();
            list.addAll(Arrays.asList('$', 'A','B','1','2','c','d','@','!','3','4'));

            ArrayList<Character> output = new ArrayList<>(list);

            output.removeIf(p -> Character.isLetter(p));

            System.out.println(output);

        }
    }
