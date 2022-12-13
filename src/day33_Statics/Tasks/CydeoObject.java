package day33_Statics.Tasks;

public class CydeoObject {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("ismail özkan",31,471,"B","25",'B','M');

        student1.study();
        System.out.println(student1.schoolName);
        System.out.println(CydeoStudent.programmingLanguage);

        student1.printProgLanguage();
        CydeoStudent.printProgLanguage();

        System.out.println(student1);


    }

}
