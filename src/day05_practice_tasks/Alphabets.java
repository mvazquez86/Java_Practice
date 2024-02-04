package day05_practice_tasks;

public class Alphabets {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {//outer loop, rows

            //System.out.println(i);

            for (char j = 'a'; j <= 'z'; j++) {//inner loop columns
                System.out.print(i);
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}


