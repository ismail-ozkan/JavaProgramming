package day39_Recap.stateTask;

public class States {

    private String name, abbreviation, politicalParty, Governor, senator;
    private int population;
    private double stateTax;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null||name.isEmpty()) {
            System.out.println("Invalid name");
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation==null||abbreviation.isEmpty()) {
            System.out.println("Invalid abbreviation");
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty==null||politicalParty.isEmpty()) {
            System.out.println("Invalid politicalParty");
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return Governor;
    }

    public void setGovernor(String governor) {
        if (governor==null||governor.isEmpty()) {
            System.out.println("Invalid governor");
        }
        Governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator==null||senator.isEmpty()) {
            System.out.println("Invalid senator");
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population<=0) {
            System.out.println("Invalid population");
        }
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if (stateTax<0) {
            System.out.println("Invalid stateTax");
        }
        this.stateTax = stateTax;
    }

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    @Override
    public String toString() {
        return "States{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + Governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
