package day36_Inheritance.Tasks.employeeTask;

public class EmployeeObjects {


    public static void main(String[] args) {

        Driver driver1 = new Driver();
        driver1.setInfo("ahmet",'M',24,2452,"driver",54000);

        Tester tester1 = new Tester();
        tester1.setInfo("ismail",'M',31, 1405,"SDET",140000);

        System.out.println(tester1);

        tester1.work();
        tester1.testing();
        //tester1.driving();
        driver1.driving();
        driver1.work();
        System.out.println(tester1);

    }




}
