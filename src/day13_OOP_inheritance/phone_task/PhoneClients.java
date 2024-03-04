package day13_OOP_inheritance.phone_task;

public class PhoneClients {

    public static void main(String[] args) {

        iPhone phone1 = new iPhone("13 pro", "5.5", 1000, "pink");
        System.out.println(phone1);

        Nokia phone2 = new Nokia("1300", "7.5", 350, "Red");
        System.out.println(phone2);

        phone2.call("9159228481");
        phone1.faceTime("9154901630");
    }
}
