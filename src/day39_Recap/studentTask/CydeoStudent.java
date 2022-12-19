package day39_Recap.studentTask;

public class CydeoStudent extends Student{

    private int batchNumber;
    private int groupNumber;
    private String programmingLanguage;

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber<=0) {
            System.err.println("Invalid batch number");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if (groupNumber<=0) {
            System.err.println("Invalid group number");
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage.isEmpty()||programmingLanguage==null) {
            System.err.println("Invalid programming language");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }
    public CydeoStudent(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, grade, "Cydeo");
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }


    @Override
    public void eat() {
        System.out.println(getName() + " is eating so much because s/he is student of " + getSchoolName() + " and learning " + getProgrammingLanguage());
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is drinking so much because s/he is student of " + getSchoolName() + " and learning " + getProgrammingLanguage());
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping very little because s/he is student of " + getSchoolName() + " and learning " + getProgrammingLanguage());
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGrade() +
                ", studentId=" + getStudentId() +
                ", fieldOfStudy='" + getFieldOfStudy() + '\'' +
                ", grade=" + getGrade() +
                ", schoolName='" + getSchoolName() + '\'' +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
