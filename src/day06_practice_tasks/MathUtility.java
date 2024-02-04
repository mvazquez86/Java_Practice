package day06_practice_tasks;
public class MathUtility {

    public static void main(String[] args) {

        double result = calculate(2.5, '*',3.0);
        System.out.println(result);

        int resultAdd = calculate(10, '+', 20);
        System.out.println(resultAdd);

        int square = square (7);
        System.out.println(square);
    }

    public static double calculate(double x, char operator, double y) {

        boolean validOperator = (operator == '+' || operator == '-' || operator == '/' || operator == '*');

        if (!validOperator) {
            return 0;
        }

        double result=0;

        switch (operator) {
            case '+' -> result = x + y;
            case '-' -> result = x - y;
            case '/' -> result = x / y;
            case '*' -> result = x * y;
        }

        return result;
    }

    public static int calculate(int x, char operator, int y) {

        boolean validOperator = (operator == '+' || operator == '-' || operator == '/' || operator == '*');

        if (!validOperator) {
            return 0;
        }

        int result=0;

        switch (operator) {
            case '+' -> result = x + y;
            case '-' -> result = x - y;
            case '/' -> result = x / y;
        }

        return result;
    }

    public static int square(int num){
     int square = calculate(num, '*', num);
        return square;
    }

}
