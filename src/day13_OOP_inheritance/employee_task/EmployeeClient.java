package day13_OOP_inheritance.employee_task;

public class EmployeeClient {

    public static void main(String[] args) {

        Developer ee1 = new Developer("marce", 37,"female", "t850", 100_000,"Microsoft", "Ruby");
        System.out.println(ee1);

        ee1.work();

        Teacher ee2 = new Teacher("Frida", 35, "female", "t890", 0, "PebbleHills HS");
        ee2.work();

        Tester ee3 =  new Tester("Jero", 25, "male");
        ee3.work();

        ee1.sleep();
        ee2.eat();
    }
}
