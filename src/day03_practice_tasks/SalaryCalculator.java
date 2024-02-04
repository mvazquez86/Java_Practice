package day03_practice_tasks;

public class SalaryCalculator {

    public static void main(String[] args) {

        double hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxRate= .06;
        double federalTaxRate = .26;

        double salaryBeforeTax = 52*weeklyHours*hourlyRate;
        double stateTax = salaryBeforeTax*stateTaxRate;
        double federalTax = salaryBeforeTax*federalTaxRate;
        double totalTax = stateTax+federalTax;
        double salaryAfterTax = salaryBeforeTax-totalTax;

        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("Federal tax is: $" + federalTax);
        System.out.println("State tax is: $" + stateTax);
        System.out.println("Total tax is: $" + (stateTax+federalTax));
        System.out.println("Net income is $" + salaryAfterTax);


    }
}
