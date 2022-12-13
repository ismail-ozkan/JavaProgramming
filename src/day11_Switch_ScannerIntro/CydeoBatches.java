package day11_Switch_ScannerIntro;

import java.util.Scanner;

public class CydeoBatches {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Choose and Write Number of your batch type: ");
        System.out.println("1. US morning");
        System.out.println("2. US evening");
        System.out.println("3. EU");
        System.out.print("Enter Here: ");

        String result = "";
        int batchType = input.nextInt();
// SOLUTİON 3
        if (batchType<=3 && batchType>=1) {
            result = (batchType==1)? "Class times are 10-5 EST. M, T, Th, F."
                    : (batchType==2)? "Class times are 7-10 EST. M, T, W, Th, S, S"
                    : "Class times are  10-5 EST. M, T, W, Th, F.";
        } else {
            result = "Invalid Batch";
        }
// SOLUTİON 2
/* SOLUTİON 2
        if (batchType==1 || batchType==2 || batchType==3) {
            switch (batchType) {
                case 1:
                    result = "Class times are 10-5 EST. M, T, Th, F.";
                    break;
                case 2:
                    result = "Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;
                default:
                    result = "Class times are  10-5 EST. M, T, W, Th, F.";
                    break;
            }
        } else {
            result = "Invalid Batch";
        }
*/
// SOLUTİON 1
/* SOLUTİON 1
        if (batchType==1 || batchType==2 || batchType==3){
            if (batchType==1) {
                result = "Class times are 10-5 EST. M, T, Th, F.";
            } else if (batchType==2) {
                result = "Class times are 7-10 EST. M, T, W, Th, S, S";
            } else {
                result = "Class times are  10-5 EST. M, T, W, Th, F.";
            }
        } else {
            result = "Invalid Batch";
        }
*/
        System.out.println(result);

    }

}
/*
4. Create a class named Cydeo batches. In Cydeo we have three batch types:
        US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.
        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"
        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */