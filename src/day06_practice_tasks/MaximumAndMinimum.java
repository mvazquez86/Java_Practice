package day06_practice_tasks;

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
    }

    return result;
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
