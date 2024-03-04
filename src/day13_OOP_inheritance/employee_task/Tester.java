package day13_OOP_inheritance.employee_task;

public class Tester extends Employee {
    public Tester(String name, int age, String gender) {
        super(name, age, gender);
    }

    public Tester(String name, int age, String gender, String employeeId, double salary, String companyName) {
        super(name, age, gender, employeeId, "Tester", salary, companyName);
    }



    @Override
    public void work(){
        System.out.println(getJobTitle() + "  "+ getName() + " is Testing");
    }
}
