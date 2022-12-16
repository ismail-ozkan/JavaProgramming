package day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {

        Tester tester = new Tester("ismail", 31,'M',140590,"SDET",80000);
        Developer developer = new Developer("ahmet",34,'M',44252,"Full Stack",100000);
        Teacher teacher = new Teacher("asia",33,'F',41222,"Soft Skil Teacher",110000);
        Student student = new Student("Fred",22,'M',124522,"Student");

        System.out.println(tester);
        tester.createTicket();
        tester.work();
        tester.getSalary();


    }



}
