package day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {

        /*
        90-100: Excellent
        80-89: Great
        70-79: Good
        60-69: Passed
        0-59: Failed
         */

        int score = 75;

        if (score>=0 && score<=100) { //if the score is valid
            // 5 possibilities
            if (score>=90/*&& score<=100*/) {
                System.out.println("Excellent");
            } else if (score>=80/* && score<=89*/) {
                System.out.println("Great");
            } else if (score>=70/* && score<=80*/) {
                System.out.println("Good");
            } else if (score>=60/* && score<=69*/) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }

        }else { //if the score is NOT valid
            System.out.println("Invalid Score");
        }

        System.out.println("-----------------------");

        String result = "";// temporary value


        if (score>=0 && score<=100) { //if the score is valid
            // 5 possibilities
            if (score>=90/*&& score<=100*/) {
                result = "Excellent";
            } else if (score>=80/* && score<=89*/) {
                result = "Great";
            } else if (score>=70/* && score<=80*/) {
                result = "Good";
            } else if (score>=60/* && score<=69*/) {
                result = "Passed";
            } else {
                result = "Failed";
            }

        }else { //if the score is NOT valid
            result = "Invalid Score";
        }

        System.out.println(result);

    }
}
