package day36_Inheritance.Tasks.employeeTask;

public class Tester extends Employee {

    public void setInfo(String name, char gender, int age, int ID, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void testing(){
        System.out.println(name + " is testing");
    }

    public void creatingTicket(){
        System.out.println(name + " is creating ticket");
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
