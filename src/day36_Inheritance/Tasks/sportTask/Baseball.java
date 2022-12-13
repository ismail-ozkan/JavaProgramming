package day36_Inheritance.Tasks.sportTask;

public class Baseball extends Sport{

    public void setInfo(String name, int numberOfPlayers, int numberOfReferre, int rules) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfReferre = numberOfReferre;
        this.rules = rules;
    }

    public void baserunning(){
        System.out.println(name + " is baserunning!!");
    }
}
