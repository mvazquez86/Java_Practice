package day07_practice_tasks;

public class AddressClients {

    public static void main(String[] args) {

        Address a1 = new Address();
        a1.buildingNumber = 7109;
        a1.street = "Edgemere";
        a1.city = "El Paso";
        a1.state = "TX";
        a1.zipCode = "79936";

        System.out.println(a1);



        Address a2 = new Address ();
        a2.buildingNumber = 11380;
        a2.street = "Montwood";
        a2.city = "Juarez";
        a2.state = "AZ";
        a2.zipCode = "79912";

        System.out.println(a2);
    }

    /*4. Create a custom class named Address with the following attributes and actions:

      Attributes:
            buildingNumber (int): used to store the building number of the address.
            street (String): used to store the street of the address.
            city (String): used to store the city of the address.
            state (String): used to store the state abbreviations of the address.
            zipCode (String): used to store the zip code of the address.

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
}
