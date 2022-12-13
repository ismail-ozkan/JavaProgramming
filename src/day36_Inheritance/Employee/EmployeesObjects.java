package day36_Inheritance.Employee;

public class EmployeesObjects {

    public static void main(String[] args) {

        Tester tester1 = new Tester();

        tester1.name = "ismail";
        tester1.age = 31;
        tester1.gender = 'M';
        tester1.ID = 14050;
        tester1.companyName = "Cydeo";
        tester1.salary = 110000;
        tester1.jobTitle = "SDET";

        tester1.work();
        tester1.test();

        System.out.println(tester1);

        System.out.println("-------------------------");


        Developer developer1 = new Developer();

        developer1.name = "halid";

        developer1.work();
        developer1.develop();



    }


}
