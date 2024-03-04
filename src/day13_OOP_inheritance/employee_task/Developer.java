package day13_OOP_inheritance.employee_task;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, int age, String gender, String employeeId, double salary, String companyName, String programmingLanguage) {
        super(name, age, gender, employeeId, "Developer", salary, companyName);
        setProgrammingLanguage(programmingLanguage);
    }


    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work(){
        System.out.println(getJobTitle()+ " " +getName() + " is coding in "+getProgrammingLanguage());
    }
}
