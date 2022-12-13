package day36_Inheritance.Tasks.scrumTeamTask;

public class ProductOwner extends Employee{

    public String productName;

    public void setInfo(String name, int age, char gender, int ID, String jobTitle, double salary, String productName){
        this.productName = productName;
        setInfo(name, age, gender, ID, jobTitle, salary);
    }

}
