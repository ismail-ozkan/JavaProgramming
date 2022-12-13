package day12_Scanner;
// import java.util.*;// ...util.* is called wild import. use for importing every thing from util package
                                                        // Scanner class is one of them
import java.util.Scanner;


public class ScannerPractice {

    public static void main(String[] args) {

        /*
        new Scanner(System.in).nextInt();
        new Scanner(System.in).nextInt();
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 7:");

        int num = scan.nextInt();

        String result = "";

        if (num>=1&&num<=7) {
            if (num==1){
                result ="Monday";
            } else {
                if (num==2) {
                    result = "Tuesday";
                } else if (num==3){
                    result = "Wednesday";
                } else {
                    result = (num==4)?"Thursday" :(num==5)?"Friday" : (num==6)?"Saturday" : "Sunday";
                    /* other way
                    switch (num) {
                        case 4: result="Thursday";break;
                        case 5: result="Friday"; break;
                        case 6: result="Saturday"; break;
                        default: result = "Sunday";break;
                    }*/
                }
            }
        } else {
            result = "Invalid Number";
        }
        System.out.println(result);

        scan.close();

    }

}
