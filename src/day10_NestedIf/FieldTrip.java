package day10_NestedIf;

public class FieldTrip {

    public static void main(String[] args) {

        int grade = 7;
        String location = "";
        String numberOfGroups = "";
        String teacherInCharge = "";

        String result = "";

        result = "grade : " + grade + "\nlocation : " + location + "\nNumber of Groups : " + numberOfGroups+"" +
                "\nteacher in group : "+ teacherInCharge;

        if (grade>=1 && grade<=6){
            if (grade==1) {
                location = "Apple orchard";
                numberOfGroups = "3";
                teacherInCharge = "Ms. Smith";
            } else if (grade==2) {
                location = "Zoo";
                numberOfGroups = "7";
                teacherInCharge = "Mr. Lee";
            } else if (grade==3) {
                location = "Aquarium";
                numberOfGroups = "5";
                teacherInCharge = "Mr. Wilson";
            } else if (grade==4) {
                location = "Movie theater";
                numberOfGroups = "2";
                teacherInCharge = "Ms. Reyes";
            } else if (grade==5) {
                location = "Museum";
                numberOfGroups = "5";
                teacherInCharge = "Ms. Lela";
            } else {
                location = "Six Flags";
                numberOfGroups = "8";
                teacherInCharge = "Mr. Watt";
            }
            System.out.println(result);
        } else {
            System.out.println("Invalid Grade");
        }

        //result = "This year place you will go is " + location + ", number of group is " + numberOfGroups + " and your teacher who go with you is "+ teacherInCharge;


    }

}
/*
8. Create a class called FieldTrip. Your school goes on a Field trip each year. The place you go will be based on your grade. Given a variable gradeNumber (1-6) figure out the details of your field trip. Print the information at the end.

    Data based on grade:

        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes

        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela

        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt
 */