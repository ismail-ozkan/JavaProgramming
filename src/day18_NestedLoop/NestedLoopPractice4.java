package day18_NestedLoop;

public class NestedLoopPractice4 {
/*
lunch:
Use a nested loop to print the following shape
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *

 */
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                if (i-j==1) continue;
                System.out.print(" ");
            }
            System.out.println();
        }


    }

}
