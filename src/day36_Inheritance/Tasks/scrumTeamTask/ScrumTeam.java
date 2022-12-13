package day36_Inheritance.Tasks.scrumTeamTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam { // Scrum Team HAS A Relationship


    public ProductOwner PO;
    public BusinessAnalyst BA;
    public ScrumMaster SM;
    public ArrayList<Tester> testers;
    public ArrayList<Developer> developers;

    public void setInfo(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }
    public void addTester(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }
    public void removeTester(int id){
        testers.removeIf(p -> p.ID==id);
    }
    public void addDeveloper(Developer developer){
        developers.add(developer);
    }
    public void addDeveloper(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }
    public void removeDeveloper(int id){
        developers.removeIf(p -> p.ID==id);
    }


    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", Number Of Testers=" + testers.size() +
                ", Number Of Developers=" + developers.size() +
                '}';
    }
}
