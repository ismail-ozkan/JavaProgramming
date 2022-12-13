package day38_Inheritance.tasks.employeeTask;

public class Driver extends Employee{

    public Driver(String name, String jobTitle, String salaryName, String comapnyName, int age, int id, char gender) {
        super(name, jobTitle, salaryName, comapnyName, age, id, gender);
    }

    @Override
    public void work() {
        System.out.println(name + " is driving");
    }

}
