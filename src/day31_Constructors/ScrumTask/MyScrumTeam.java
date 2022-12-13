package day31_Constructors.ScrumTask;

import java.util.Arrays;

public class MyScrumTeam {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Layan", 11, "QA", 110000 );
        Tester tester2=new Tester("Ali",43,"SDET",142000);
        Tester tester3=new Tester("Alex",44,"SE",135000);
        Tester tester4= new Tester("Lala", 23,"SDET",115000);

        Developer developer1 = new Developer("Ali",22,"FullStack",120000);
        Developer developer2 = new Developer("Ahmet",39,"FullStack",140000);
        Developer developer3 = new Developer("Fatma",28,"FullStack",950000);
        Developer developer4 = new Developer("Mustafa",142163,"FullStack",124000);

        Tester[] testers = {tester2,tester3,tester4};

        Developer[] developers = {developer1,developer2,developer3,developer4};

        ScrumTeam myScrumTeam = new ScrumTeam("A","B","C",14);

        myScrumTeam.addTester(tester1);
        myScrumTeam.addTesters(testers);

        myScrumTeam.addDevelopers(developers);


        System.out.println("myScrumTeam = " + myScrumTeam);

        System.out.println("--------------------------------");

        for ( Tester eachTester : myScrumTeam.testersList){
            System.out.println(eachTester.name + " : " + eachTester.salary);
        }

        System.out.println("--------------------------------");

        for (Developer eachDeveloper: myScrumTeam.devopsList) {
            System.out.println(eachDeveloper.name + " : " + eachDeveloper.salary);
        }

        myScrumTeam.removeTester(23);
        myScrumTeam.removeDevelopers(22);
        System.out.println("myScrumTeam = " + myScrumTeam);
    }

}
