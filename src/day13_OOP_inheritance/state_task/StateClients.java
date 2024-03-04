package day13_OOP_inheritance.state_task;

import org.w3c.dom.ls.LSOutput;

public class StateClients {

    public static void main(String[] args) {

        State state1 = new State("New Mexico", "NM", "Red", "Mr. Perez", "Mrs. Sanches", 35000);
        System.out.println(state1);

        state1.setPopulation(450000);
        System.out.println(state1.getPopulation());

        Texas state2 = new Texas("republican", "Roman", "Frida", 3_500_000);
        System.out.println(state2);

    }
}
