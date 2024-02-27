package day11_practice_tasks;

public class CydeoStudentClient {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Marcela", 37, 87000423, 'A', 33, "Team 5");
        student1.study();
        student1.attendClass();
        student1.printSchoolName();
        student1.printProgrammingLanguage();
        System.out.println(student1);
    }
}
