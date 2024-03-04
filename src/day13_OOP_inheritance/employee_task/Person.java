package day13_OOP_inheritance.employee_task;

public class Person {

    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name == null){
            System.err.println("Name can not be null or empty");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0){
            System.err.println("Age can not be zero nor negative");
            System.exit(1);
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void eat(){
        System.out.println(getName()+ " is eating");
    }

    public void sleep(){
        System.out.println(getName()+ " is sleeping");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
