package day36_Inheritance.Tasks.scrumTeamTask;

public class ScrumMaster extends Employee{
    public boolean hasScrumExperience;

    public void setInfo(String name, int age, char gender, int ID, String jobTitle, double salary, boolean hasScrumExperience){
        this.hasScrumExperience = hasScrumExperience;
        setInfo(name, age, gender, ID, jobTitle, salary);
    }
}
