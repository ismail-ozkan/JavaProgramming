package day46_Polymorphism.tasks;

import day43_Abstraction.employeeTask.Developer;
import day43_Abstraction.employeeTask.Employee;
import day43_Abstraction.employeeTask.Tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employees {

    public static void main(String[] args) {

        Employee[] employees = {
                new Tester("Sherali", 32, 'M',1, "QA", 110000),
                new Developer("Zuhal", 27, 'F', 2, "Java Developer", 128000),
                new Tester("George", 28,'M', 3, "SDET", 120000),
                new Developer("Cristina", 23, 'F',4, "Software Developer", 135000),
                new Tester("Cihad", 30, 'M',5, "SDET", 105000),
                new Developer("Gulistan",  26, 'F',6, "Web Developer", 130000),
                new Tester("Yuliya",  28, 'F',7, "QE", 120000),
                new Developer("Cassendra",  29, 'F',8, "Front-end Developer", 140000),
                new Tester("Aygu",  25, 'F',9, "SDET", 130000),
                new Developer("Sophie",  26, 'F',10, "Back-end Developer", 140000),
                new Tester("Timur",  29, 'M',11, "SDET", 115000),
                new Developer("Fady",  26, 'F',12, "Full Stack Developer", 142000),
                new Tester("Iryna",  24, 'F',13, "QE", 125000),
                new Developer("Enes",  26, 'M',14, "Full Stack Developer", 142000),
                new Tester("Mikael",  30, 'M',15, "SDET", 105000),
        };

        //2.1
        List<Employee> scrumMembers = new ArrayList<>();

        scrumMembers.addAll(Arrays.asList(employees));

        //2.2
        List<Tester> testers = new ArrayList<>();
        //2.3
        List<Developer> developers = new ArrayList<>();

        for (Employee scrumMember : scrumMembers) {
            if (scrumMember.getClass().getSimpleName().equals("Tester")) {
                testers.add((Tester)scrumMember);
            } else if (scrumMember.getClass().getSimpleName().equals("Developer")){
                developers.add((Developer) scrumMember);
            }
        }
        //2.4 which tester has the maximum salary?



        //2.5 which developer has the maximum salary?



//        System.out.println("testers.size() = " + testers.size());
//        System.out.println("developers.size() = " + developers.size());
        //2.4 which tester has the maximum salary?
        double max = 0.0;
        List<Tester> maxSalaryTester = new ArrayList<>();
        for (Tester tester : testers) {
            if (max<=tester.getSalary()) {
                max = tester.getSalary();
            }
        }
        double finalMax = max;
        testers.removeIf(p -> p.getSalary() != finalMax);
        if (testers.size()==1){
            System.out.println(testers.get(0).getName() + " has max salary among testers");
        } else {
            String result = "";
            for (Tester tester : testers) {
                result+= tester.getName()+", ";
            }
            System.out.println(result += "have max salary among testers");
        }


        //2.5 which developer has the maximum salary?
        double maxSalary = developers.get(0).getSalary();
        for (Developer developer : developers) {
            if (maxSalary<developer.getSalary()) {
                maxSalary = developer.getSalary();
            }
        }
        double finalMaxSalary = maxSalary;
        developers.removeIf(p -> p.getSalary() != finalMaxSalary);
        if (developers.size()==1){
            System.out.println(developers.get(0).getName() + " has max salary among  developers");
        } else {
            String result = "";
            for (Developer developer : developers) {
                result+= developer.getName()+", ";
            }
            System.out.println(result += "have max salary among  developers");
        }



    }

}
/*
2. Given the following array that contains Employee objects:
			Employee[] employees = {
                new Tester("Sherali", 32, 'M',1, "QA", 110000),
                new Developer("Zuhal", 27, 'F', 2, "Java Developer", 128000),
                new Tester("George", 28,'M', 3, "SDET", 120000),
                new Developer("Cristina", 23, 'F',4, "Software Developer", 135000),
                new Tester("Cihad", 30, 'M',5, "SDET", 105000),
                new Developer("Gulistan",  26, 'F',6, "Web Developer", 130000),
                new Tester("Yuliya",  28, 'F',7, "QE", 120000),
                new Developer("Cassendra",  29, 'F',8, "Front-end Developer", 140000),
                new Tester("Aygu",  25, 'F',9, "SDET", 130000),
                new Developer("Sophie",  26, 'F',10, "Back-end Developer", 150000),
                new Tester("Timur",  29, 'M',11, "SDET", 115000),
                new Developer("Fady",  26, 'F',12, "Full Stack Developer", 142000),
                new Tester("Iryna",  24, 'F',13, "QE", 125000),
                new Developer("Enes",  26, 'M',14, "Full Stack Developer", 142000),
                new Tester("Mikael",  30, 'M',15, "SDET", 105000),
        	};

    		(import them from day43 package)

	   	2.1 store all the developers & testers into the following List of employees
        		List<Employee> scrumMembers = new ArrayList<>();

        2.2 store all the testers into the following List of testers:
        		List<Tester> testers = new ArrayList<>();

        2.3 store all the developers into the following List of developers:
        		List<Developer> developers = new ArrayList<>();

        2.4 which tester has the maximum salary?

        2.5 which developer has the maximum salary?
 */