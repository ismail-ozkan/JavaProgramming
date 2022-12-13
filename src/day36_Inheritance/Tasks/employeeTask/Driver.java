package day36_Inheritance.Tasks.employeeTask;

public class Driver extends Employee{

    public void setInfo(String name, char gender, int age, int ID, String jobTitle, double salary){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public  void driving(){
        System.out.println(name + " is driving");
    }

    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
