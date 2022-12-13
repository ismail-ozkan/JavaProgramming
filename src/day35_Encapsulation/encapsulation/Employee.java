package day35_Encapsulation.encapsulation;

import java.awt.*;
import java.util.Scanner;

public class Employee {

    private String name;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public void setName(String name){
        if (name.isEmpty()) {
            return;
            /*System.err.println("Invalid name");
            System.exit(0);*/
        }
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setGender(char gender){
        if (!(gender=='F'||gender=='M')) {
            System.err.println("Invalid gender");
            System.exit(0);
        }
        this.gender = gender;
    }
    public char getGender(){
        return gender;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age<16||age>90) {
            return;
            /*System.err.println("Invalid age");
            System.exit(0);*/
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary<=0) {
            System.err.println("Invalid Salary");
            System.exit(0);
        }
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                '}';
    }
}
/*
1. Create an Employee Class:
			private variables:
				name, gender, age, salary

			Encapsulate all the private fields

				1. Name can not be empty
				2. gender can not anything other than female or male
				3. age can not be less than 16, and greater than 90
				4. salary can not be zero or negative

 */