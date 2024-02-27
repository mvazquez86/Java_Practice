package day11_practice_tasks;

public class CydeoStudent {

    public String name;
    public int age;
    public int id;
    public char grade;
    public int batchNumber;
    public String groupNumber;
    public static String schoolName = "Cydeo";
    public static String programmingLanguage = "Java";

    public CydeoStudent(String name, int age, int id, char grade, int batchNumber, String groupNumber) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study(){
        System.out.println(name + " is studying.");
    }

    public void attendClass(){
        System.out.println(name + " is attending the live class.");
    }

    public void printSchoolName(){
        System.out.println("schoolName = " + schoolName);
    }

    public void printProgrammingLanguage(){
        System.out.println("programmingLanguage = " + programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber='" + groupNumber + '\'' +
                ", schoolName= " + schoolName +
                ", programmingLanguage= " + programmingLanguage +
                '}';
    }
}
