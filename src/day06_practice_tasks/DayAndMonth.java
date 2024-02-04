package day06_practice_tasks;

public class DayAndMonth {

    public static String day(int num){

        String day = "Invalid number";

        if (num>=1 && num<=7){
            switch (num){
                case 1-> day = "Monday";
                case 2-> day = "Tuesday";
                case 3-> day = "Wednesday";
                case 4-> day = "Thursday";
                case 5-> day = "Friday";
                case 6-> day = "Saturday";
                case 7-> day = "Sunday";
            }
            //return day;
        }
        return day;
    }

    public static String month(int num) {

        String month = "Invalid month";

        if (num >= 1 & num <= 12) {
            switch (num) {
                case 1 -> month = "January";
                case 2 -> month = "February";
                case 3 -> month = "March";
                case 4 -> month = "April";
                case 5 -> month = "May";
                case 6 -> month = "June";
                case 7 -> month = "July";
                case 8 -> month = "August";
                case 9 -> month = "September";
                case 10 -> month = "October";
                case 11 -> month = "November";
                case 12 -> month = "December";
            }
        }
         return month;
    }

    public static String numberOfDays(int num) {
        String month = month(num);
        String result = month + " has 31 days";

        if (month == "February") {
            result = month + " has 29 days";
        } else if (month == "April" || month == "June" || month == "September" || month == "November") {
            result = month + " has 30 days";
        }
        return result;
    }


    public static void main(String[] args) {
        String day = day(5);
        System.out.println(day);

        String month = month(7);
        System.out.println(month);

        String numberOfDays =numberOfDays(11);
        System.out.println(numberOfDays);
    }
}

/*4. Create a class named DayAndMonth:

	3.1 Create a method named day that displays the day's name based on the given number.
	If the number is invalid, print "Invalid Number".

			Example:
				day(5);

			Output:
				Friday

	3.2 Create a method named monthName that displays the month's name based on the given number.
	If the number is invalid, print "Invalid Number."


			Example:
				monthName(6);

			Output:
				June

	3.3 Create a method named daysInMonth that displays the number of days in the month based on the given number.
	If the number is invalid, print "Invalid Number."

				Example:
					daysInMonth(6);

				Output:
					June has 30 days

*/
