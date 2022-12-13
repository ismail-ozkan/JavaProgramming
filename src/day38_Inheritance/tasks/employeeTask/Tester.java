package day38_Inheritance.tasks.employeeTask;

public class Tester extends Employee{

    public String testArea;


    public Tester(String name, String jobTitle, String salaryName, String comapnyName, int age, int id, char gender, String testArea) {
        super(name, jobTitle, salaryName, comapnyName, age, id, gender);
        this.testArea = testArea;
    }

    @Override
    public void work() {
        System.out.println(name + " is testing");
    }
}
