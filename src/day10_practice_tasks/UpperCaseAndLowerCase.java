package day10_practice_tasks;

public class UpperCaseAndLowerCase {

    public static void main(String[] args) {

        String str = "JAVA java";

        int upper = 0;
        int lower = 0;

        for (char each : str.toCharArray()) {

            if (Character.isLetter(each)) {

                if (Character.isLowerCase(each)) {
                    lower += 1;
                } else {
                    upper += 1;
                }
            }
        }
        System.out.println("lower = " + lower);
        System.out.println("upper = " + upper);

        System.out.println(lower == upper);
    }
}
