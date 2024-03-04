package day13_OOP_inheritance.state_task;

public class Florida extends State {

    public Florida( String polParty, String governor, String senator, int population) {
        super("Florida", "FL", polParty, governor, senator, population);
    }
}
