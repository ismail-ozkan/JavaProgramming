package day10_NestedIf;

public class TernariesWithNestedIf {

    public static void main(String[] args) {

        int score = 85;

        //Solution1:
        String result = (score >= 0 && score <= 100)?
                /*inner if block*/(score>=90)? "Excellent" : (score>=80)? "Great":(score>=70)? "Good":(score>=60)? "Passed"
                :"Failed"
                :"Invalid Score";

        System.out.println("result = " + result);




        //Solution2:

        String result2 = "";

        if (score >= 0 && score <= 100) {
            result2 = (score>=90)? "Excellent" :(score>=80)? "Great":(score>=70)? "Good":(score>=60)? "Passed"
                    :"Failed";

        }else {
            result2 = "Invalid Score";
        }


        System.out.println("result2 = " + result2);

    }
}
/*if (score>=0 && score<= 100){
            if (score>= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid Score");
        }
*/