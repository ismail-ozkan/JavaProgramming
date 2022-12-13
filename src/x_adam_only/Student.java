package x_adam_only;

public class Student {

    public String name;
    public char gender;
    public String dateOfBirtday;
    public int age;
    public int studentID;
    public double grade;


    public Student(String name, char gender, String dateOfBirtday, int age, int studentID, double grade) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirtday = dateOfBirtday;
        this.age = age;
        this.studentID = studentID;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dateOfBirtday='" + dateOfBirtday + '\'' +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }
}
