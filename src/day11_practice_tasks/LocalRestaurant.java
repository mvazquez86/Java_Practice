package day11_practice_tasks;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant ("Santiago", "St Louis", 5);
        System.out.println(restaurant1);

        Server[] servers = {
                new Server("Roman", 0713, 15.50, false),
                new Server("Frida",1123, 13.75,true)
        };

        Chef[] chefs = {
                new Chef("Jero", 0315, 18.98, true),
                new Chef("Viviana",1234, 25.33, true)
        };

        restaurant1.hireChef(chefs);
        restaurant1.hireServer(servers);
        System.out.println(restaurant1);

       // restaurant1.terminateChef(chefs.);
    }
}
