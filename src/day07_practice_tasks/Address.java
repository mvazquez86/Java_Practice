package day07_practice_tasks;

public class Address {

    public int buildingNumber;
    public String street;
    public String city;
    public String state;
    public String zipCode;

    public String toString() {
        return buildingNumber + " " + street +"\n"
                + city + " " + state + ", " + zipCode;
    }
}

/*4. Create a custom class named Address with the following attributes and actions:
      Actions:
            toString(): returns the string representation of the address object in the following format:

                  Example:
                      buildingNumber = 7925;
                      street = "Jones Branch Dr";
                      city = "McLean";
                      state = "VA";
                       zipCode = 22012;

                  Output:
                        7925 Jones Branch Dr
                        McLean Va, 22012


      Create another class named AddressClients, create multiple address objects, and test each function of the address object.



*/
