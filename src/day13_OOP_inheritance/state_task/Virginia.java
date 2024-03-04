package day13_OOP_inheritance.state_task;

public class Virginia extends State {

    public Virginia(String polParty, String governor, String senator, int population) {
        super("Virginia", "VA", polParty, governor, senator, population);
    }
}
