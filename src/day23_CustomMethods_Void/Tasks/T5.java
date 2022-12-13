package day23_CustomMethods_Void.Tasks;

public class T5 {
    //5. create a method that can calculate the grade of the student based on the score
    public static void main(String[] args) {

        int resultOfExam = 45;

        gradeOfStudent(resultOfExam);

    }

    public static void gradeOfStudent(int resultOfExam) {

        char grade = 'C';
        if (resultOfExam>=90) {
            grade = 'A';
        } else if (resultOfExam >=70) {
            grade = 'B';
        }
        System.out.println(grade);
    }

}
