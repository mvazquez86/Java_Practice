package day08_practice_tasks;

import java.util.Scanner;

public class CombineTwoWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");
        String word1 = input.next();

        System.out.println("Enter second word");
        String word2 = input.next();

        input.close();

        String wordsTogether = word1+word2;
        System.out.println(wordsTogether);

        if (word1.charAt(word1.length()-1)==word2.charAt(0)){
            System.out.println(word1+word2.substring(1));
        }

    }
}
