package day13_OOP_inheritance.state_task;

public class State {

    private String name;
    private String abbr;
    private String polParty;
    private String governor;
    private String senator;
    private int population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.isBlank() || name == null){
            System.err.println("Invalid input");
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        if (abbr.isBlank() || abbr.isBlank() || abbr == null){
            System.err.println("Invalid input");
            System.exit(1);
        }
        this.abbr = abbr;
    }

    public String getPolParty() {
        return polParty;
    }

    public void setPolParty(String polParty) {

        if (polParty.isBlank() || polParty.isBlank() || polParty == null){
            System.err.println("Invalid input");
            System.exit(1);
        }
        this.polParty = polParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if (governor.isBlank() || governor.isBlank() || governor == null){
            System.err.println("Invalid input");
            System.exit(1);
        }
        this.governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator.isBlank() || senator.isBlank() || senator == null){
            System.err.println("Invalid input");
            System.exit(1);
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if(population <= 0){
            System.err.println("Population has to be greater than 0");
            System.exit(1);
        }
        this.population = population;
    }

    public State(String name, String abbr, String polParty, String governor, String senator, int population) {
        setName(name);
        setAbbr(abbr);
        setPolParty(polParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", abbr='" + abbr + '\'' +
                ", polParty='" + polParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                '}';
    }
}
