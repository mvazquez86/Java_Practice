package day02_practice_tasks;

public class ShippingAddress {

    public static void main(String[] args) {

        String fullName = "Aaron Kissinger";
        int buildingNumber = 13621;
        String streetName = "Legacy Circle";
        String city = "Fairfax";
        String state = "VA";
        int zipCode = 22030;

        System.out.println("Your shipping address is:");
        System.out.println("\t\t" + fullName + "\n\t\t" + buildingNumber + " "+streetName+"\n\t\t"+
                city + ", " + state + " " + zipCode);


    }
}
