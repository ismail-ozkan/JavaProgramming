package day36_Inheritance.Tasks.scrumTeamTask;

public class Tester extends Employee{

    public String testField;

    public void setInfo(String name, int age, char gender, int ID, String jobTitle, double salary, String testField){
        this.testField = testField;
        setInfo(name, age, gender, ID, jobTitle, salary);
    }
    public void test(){
        System.out.println(name + " is testing");
    }

    public String toString() {
        return "Tester{" +
                "testField='" + testField + '\'' +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
