package day36_Inheritance.Tasks.sportTask;

public class Football extends Sport{

    public void setInfo(String name, int numberOfPlayers, int numberOfReferre, int rules) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfReferre = numberOfReferre;
        this.rules = rules;
    }

    public void penatly(){
        System.out.println(name + " shot penalty");
    }

}
