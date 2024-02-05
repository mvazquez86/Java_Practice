 package day06_practice_tasks;

public class MaximumAndMinimum {

    public static void main(String[] args) {

        int maxInt =  max(7,13);
        System.out.println(maxInt);

        double maxDou =  max(7.5,7.6);
        System.out.println(maxDou);

        int minInt =  min(7,13);
        System.out.println(minInt);

        double minDoub =  min(7.13,11.23);
        System.out.println(minDoub);

    }

    public static int max(int num1, int num2){

        if(num1<num2){
            return num2;
        }
        else{
            return num1;
        }
    }

    public static double max(double num1, double num2) {

        if (num1 < num2) {
            return num2;
        } else {
            return num1;
        }
    }

    public static int min(int num1, int num2){

        if(num1<num2){
            return num1;
        }
        else{
            return num2;
        }
    }

    public static double min(double num1, double num2){

        if(num1<num2){
            return num1;
        }
        else{
            return num2;
        }
    }

}
/*3. Create a class named MaximumAndMinimum:

	2.1 Create a method named max that returns the maximum number between two integer numbers.

	2.2 Create a method named max that returns the maximum number between two double numbers.

	2.3 Create a method named min that returns the minimum number between two integer numbers.

	2.4 Create a method named min that returns the minimum number between two double numbers.


			Example1:
				double n = max(10.5, 30.2);

			Output:
				30.2

			Example2:
				int m = min(100, 200);

			Output:
				100

*/

