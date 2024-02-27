package day11_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner;
    public String location;
    public int numberOfStars;
    public ArrayList<Server> servers;
    public ArrayList<Chef> chefs;

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
        this.servers = new ArrayList<>();
        this.chefs = new ArrayList<>();
    }

    public void hireServer(Server serverVar){
        servers.add(serverVar);
    }

    public void hireServer(Server[] serverA){
        servers.addAll(Arrays.asList(serverA));
    }

    public void hireChef(Chef chefVar){
        chefs.add(chefVar);
    }

    public void hireChef(Chef[] chefA){
        chefs.addAll(Arrays.asList(chefA));
    }

    public void terminateChef(int employeeID){
        chefs.removeIf(p-> p.employeeID == employeeID);
    }

    public void terminateServer (int employeeID){
        servers.removeIf(p->p.employeeID == employeeID);
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", servers=" + servers +
                ", chefs=" + chefs +
                ", number of servers= " + servers.size()+
                ", number of chefs= " + chefs.size() +
                '}';
    }
}
