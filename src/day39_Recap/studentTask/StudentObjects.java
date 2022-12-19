package day39_Recap.studentTask;

public class StudentObjects {
    public static void main(String[] args) {

        Person person = new Person("ismail", 31, 'M');
        Person person2 = new Person("kübra", 31, 'F');
        System.out.println(person);
        System.out.println(person2);

        Student student = new Student("ismail",31,'M',256,"Sdet",'B',"Cydeo");
        System.out.println(student);
        student.eat();

        CydeoStudent cydeoStudent = new CydeoStudent("ismail",31,'M',256,"Sdet",'B',10,25,"Java");
        System.out.println(cydeoStudent);
        cydeoStudent.eat();

    }
}