package day13_OOP_inheritance.phone_task;

public class iPhone extends Phone {

    public iPhone(String model, String size, double price, String color) {
        super("iPhone", model, size, price, color);
    }

    public void faceTime(String phoneNumber){
        System.out.println("Face timing with the number " + phoneNumber);
    }
}
