package day30_CustomClass;

public class Employee {

    String name;
    int ID;
    char gender;
    int age;
    String jobTitle;
    int salary;
    boolean isFullTime;

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void setInfo(String name, char gender,int age, int ID, String jobTitle, int salary, boolean isFullTime) {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
        this.age = age;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public void work(){
        System.out.println(jobTitle + name + " is working for $" + salary);
    }


}
/*
Employee Class:

		Attributes:
			name, id, gender, jobTitle, salary, isFullTime(boolean)

		Actions:
			toString(): to be bale to print each employee object
			setInfo(): to be able to set all the attributes
			work()...

CapitalOne Class:

	1. create 5 Employee objects
	2. store those 5 employee objects into an array
	3. how many employees are full time employees?
	4. What's the minimum salary
	5. what's the maximum salary
 */