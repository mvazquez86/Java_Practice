package day13_OOP_inheritance.state_task;

public class Texas extends State {
    public Texas(String polParty, String governor, String senator, int population) {
        super("Texas", "TX", polParty, governor, senator, population);
    }
}
