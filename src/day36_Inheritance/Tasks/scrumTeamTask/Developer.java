package day36_Inheritance.Tasks.scrumTeamTask;

public class Developer extends Employee{

    public String devField;

    public void setInfo(String name, int age, char gender, int ID, String jobTitle, double salary, String devField){
        this.devField = devField;
        setInfo(name, age, gender, ID, jobTitle, salary);
    }


    public void develop(){
        System.out.println(name + " is developing a app");
    }

    public String toString() {
        return "Developer{" +
                "devField='" + devField + '\'' +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
