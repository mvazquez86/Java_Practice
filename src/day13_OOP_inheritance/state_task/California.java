package day13_OOP_inheritance.state_task;

public class California extends State{
    public California( String polParty, String governor, String senator, int population) {
        super("California", "CA", polParty, governor, senator, population);
    }
}
