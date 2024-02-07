package day07_practice_tasks;

public class EmployeeClients {

    public static void main(String[] args) {


        Employee ee1 = new Employee();
        ee1.name = "Marcela";
        ee1.age = 37;
        ee1.gender = 'f';
        ee1.salary = 120000;
        ee1.jobTitle = "SDET";

        System.out.println(ee1);
        ee1.work();

        Employee ee2 = new Employee();
        ee2.name = "Roman";
        ee2.age = 4;
        ee2.gender = 'm';
        ee2.salary = 12;
        ee2.jobTitle = "Best companion dog";

        System.out.println(ee2);
        ee2.work();

    }
}