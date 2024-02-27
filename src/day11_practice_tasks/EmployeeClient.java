package day11_practice_tasks;

public class EmployeeClient {

    public static void main(String[] args) {

        Employee ee1 = new Employee("Marcela", 37, 'F', "SDET");
        System.out.println(ee1);
        ee1.work();
    }
}
