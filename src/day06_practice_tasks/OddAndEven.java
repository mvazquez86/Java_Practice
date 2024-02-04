package day06_practice_tasks;

public class OddAndEven {
    public static void main(String[] args) {

        String result = isOdd(100);
        System.out.println(result);

        boolean isEven = isEven(100);
        System.out.println(isEven);

    }


    public static String isOdd(int num) {
        String result = " ";
        if (num % 2 == 0) {
            result = "false";
        } else {
            result = "true";
        }
        return result;
    }

    public static boolean isEven (int num){
        if (num%2 ==0){
            return true;
        }
        else{
            return false;
        }

    }
}


/*1. Create a class named OddAndEven:

	1.1 Create a method named isOdd that returns true if a number is odd. Otherwise, it returns false.

			Example:
				boolean result = isOdd(100);

			Output:
				false

	1.2 Create a method named isEven that returns true if a number is even. Otherwise, it returns false.

			Example:
				boolean result = isEven(100);

			Output:
				true*/