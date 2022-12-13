package day36_Inheritance.Tasks.scrumTeamTask;

import java.util.ArrayList;

public class AmazonInc {

    public static void main(String[] args) {


        ProductOwner productOwner = new ProductOwner();
        productOwner.setInfo("PO adam",42,'M',1554,"Boss",500000,"Kraft");

        ScrumMaster scrumMaster = new ScrumMaster();
        scrumMaster.setInfo("SM Asım",32,'M',3563,"Scrum Master",14000,true);

        BusinessAnalyst businessAnalyst = new BusinessAnalyst();
        businessAnalyst.setInfo("BA Fred",38,'M',5441,"Analist",23000,"Document");

        Tester tester1 = new Tester();
        Tester tester2 = new Tester();
        Tester tester3 = new Tester();
        Tester tester4 = new Tester();
        tester1.setInfo("t1",21,'F',4563,"SDET",12000,"Mobile");
        tester2.setInfo("t2",22,'M',3365,"SDET",11000,"Hybrid");
        tester3.setInfo("t3",23,'F',4566,"QA",14000,"Web");
        tester4.setInfo("t4",22,'M',1266,"QA",11000,"Web");
        Tester[] testers = {tester2, tester3,tester4};
        ArrayList<Tester> firstTesterList = new ArrayList<>();



        Developer developer1 = new Developer();
        Developer developer2 = new Developer();
        Developer developer3 = new Developer();
        Developer developer4 = new Developer();
        Developer developer5 = new Developer();
        developer1.setInfo("d1",26,'M',7563,"Full-Stack",22000,"Mobile");
        developer2.setInfo("d2",28,'F',9893,"Full-Stack",21000,"Web");
        developer3.setInfo("d3",29,'F',5763,"Full-Stack",25000,"Hybrid");
        developer4.setInfo("d4",23,'F',2763,"Full-Stack",26000,"Mobile");
        developer5.setInfo("d5",25,'M',4763,"Full-Stack",29000,"Hybrid");
        ArrayList<Developer> firstDevList = new ArrayList<>();
        firstDevList.add(developer1);
        Developer[] developers = {developer2, developer3, developer4, developer5};


        ScrumTeam amazonScrumTeam = new ScrumTeam();

        amazonScrumTeam.setInfo(productOwner,businessAnalyst,scrumMaster);
        amazonScrumTeam.addTester(tester1);
        amazonScrumTeam.addTester(testers);
        amazonScrumTeam.addDeveloper(developer1);
        amazonScrumTeam.addDeveloper(developers);

        System.out.println(amazonScrumTeam);

        System.out.println(amazonScrumTeam.SM.hasScrumExperience);

        amazonScrumTeam.removeTester(4566);


    }



}
