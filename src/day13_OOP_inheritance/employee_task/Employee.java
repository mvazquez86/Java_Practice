package day13_OOP_inheritance.employee_task;

public class Employee extends Person {
    public Employee(String name, int age, String gender) {
        super(name, age, gender);
    }

    private String EmployeeId;
    private String jobTitle;
    private double salary;
    private String companyName;

    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String employeeId) {
        EmployeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<=0){
            System.err.println("Salary can not be zero or less than zero");
            System.exit(1);
        }

        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Employee(String name, int age, String gender, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, age, gender);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
        setCompanyName(companyName);
    }

    public void work(){
        System.out.println(getJobTitle()+ " " + getName() + " is Working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Employee name= " + getName() +
                "Employee gender " + getGender()+
                "Employee age " + getAge() +
                "EmployeeId='" + EmployeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
