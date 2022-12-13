package day36_Inheritance.Tasks.sportTask;

public class Sport {

    public String name;
    public int numberOfPlayers;
    public int numberOfReferre;
    public int rules;

    public void setInfo(String name, int numberOfPlayers, int numberOfReferre, int rules) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfReferre = numberOfReferre;
        this.rules = rules;
    }

    public void play(){
        System.out.println(name + " is playing");
    }

    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferre=" + numberOfReferre +
                ", rules=" + rules +
                '}';
    }
}
/*
4.Sports Task:
	1. Create a class named Sport
			variables:
				name, numberOfPlayers, numberOfReferre, rules



			methods:
				setInfo()
				play()
				toString()

		2. create the following sub classes of Sport:
				1. Basketball
				2. Baseball
				3. Football
				4. AmericanFootball

			Add any missing variables or methods

			Note: you can search them on google


 */