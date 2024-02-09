package day08_practice_tasks;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");
        String word1 = input.next();

        System.out.println("Enter second word");
        String word2 = input.next();

        input.close();

        System.out.println(word1.substring(1)+word2.substring(1));
    }
}
