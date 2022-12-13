package day33_Statics.Tasks;

public class CydeoStudent {

    public String name, batchNumber, groupNumber;
    public int age, ID;
    public char grade, gender;
    public static String schoolName = "Cydeo School";
    public static String programmingLanguage = "Java";

    public CydeoStudent(String name, int age, int ID, String batchNumber, String groupNumber, char grade, char gender) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.grade = grade;
        this.gender = gender;


    }

    public void study(){
        System.out.println(name + " is studying");
    }
    public void attendClass(){
        System.out.println(name + " attended the last class");
    }
    public static String  printSchoolName(){
        return schoolName;
    }
    public static void printProgLanguage(){
        System.out.println(programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", grade=" + grade +
                ", gender=" + gender +
                '}';
    }
}
/*
1. CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()
 */