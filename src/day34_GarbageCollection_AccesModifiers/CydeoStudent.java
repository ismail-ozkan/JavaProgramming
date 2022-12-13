package day34_GarbageCollection_AccesModifiers;

public class CydeoStudent {

    public String studentName;
    public static String schoolName;// = "Cydeo School";


    public CydeoStudent(String studentName){

        this.studentName = studentName;
        //schoolName = "Cydeo School";// this static variable is can set in Constructor

    }

    static {
        schoolName = "Cydeo School";
    }

}

class CydeoStudentObject{

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Jimmy");
        CydeoStudent student2 = new CydeoStudent("Kathy");

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);


    }


}