package day36_Inheritance.Tasks.employeeTask;

public class Teacher extends Employee {

    public void setInfo(String name, char gender, int age, int ID, String jobTitle, double salary){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public  void teaching(){
        System.out.println(name + " is teaching");
    }

    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
