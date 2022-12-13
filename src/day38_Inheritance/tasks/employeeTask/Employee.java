package day38_Inheritance.tasks.employeeTask;

public class Employee {

    public String name, jobTitle, salaryName, comapnyName;
    public int age, id;
    public char gender;

    public Employee(String name, String jobTitle, String salaryName, String comapnyName, int age, int id, char gender) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salaryName = salaryName;
        this.comapnyName = comapnyName;
        this.age = age;
        this.id = id;
        this.gender = gender;
    }

    public void work(){
        System.out.println(name + " is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salaryName='" + salaryName + '\'' +
                ", comapnyName='" + comapnyName + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", gender=" + gender +
                '}';
    }
}
