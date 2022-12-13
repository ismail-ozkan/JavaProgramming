package day36_Inheritance.Tasks.scrumTeamTask;

public class BusinessAnalyst extends Employee{

    public String analystField;

    public void setInfo(String name, int age, char gender, int ID, String jobTitle, double salary, String analystField){
        this.analystField = analystField;
        setInfo(name, age, gender, ID, jobTitle, salary);
    }

    public void analyze(){
        System.out.println(name + " is analyzing");
    }

}
