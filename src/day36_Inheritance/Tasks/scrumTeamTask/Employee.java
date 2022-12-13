package day36_Inheritance.Tasks.scrumTeamTask;

public class Employee extends Person{

    public int ID;
    public String jobTitle;
    public double salary;

    public void setInfo(String name, int age, char gender, int ID, String jobTitle, double salary){
        setInfo(name, age, gender);
        this.ID = ID;
        this.jobTitle =jobTitle;
        this.salary = salary;
    }

    public void work(){
        System.out.println(name + " is working");
    }

    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
