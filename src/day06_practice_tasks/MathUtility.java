package day06_practice_tasks;
public class MathUtility {

    public static void main(String[] args) {

        double result = calculate(2.5, '*',3.0);
        System.out.println(result);

        int resultAdd = calculate(10, '+', 20);
        System.out.println(resultAdd);

        int square = square (7);
        System.out.println(square);

        double squareDouble = square (7.5);
        System.out.println(squareDouble);

        int cube = square(3);
        System.out.println(cube);

        double cubeDouble = cube(3.5);
        System.out.println(cubeDouble);
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
            case '*' -> result = x * y;
        }

        return result;
    }

    public static int square(int num){
     int square = calculate(num, '*', num);
        return square;
    }

    public static double square(double num){
        double squareInt = calculate(num, '*', num);
        return squareInt;
    }

    public static int cube (int num){
        int cube = square(num)*num;
        return cube;
    }

    public static double cube (double num){
        double cube = square(num)*num;
        return cube;
    }

}
