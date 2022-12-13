package day36_Inheritance.Tasks.employeeTask;

public class Developer extends Employee{

    public void setInfo(String name, char gender, int age, int ID, String jobTitle, double salary){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public  void coding(){
        System.out.println(name + " is coding");
    }
    public void fixingBugs(){
        System.out.println(name + " is fixing bugs");
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
