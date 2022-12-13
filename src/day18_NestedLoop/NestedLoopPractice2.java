package day18_NestedLoop;

public class NestedLoopPractice2 {
/*
1. Print the following shape by using a nested Loop:
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
 */
    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
                if (j==7) continue;
                System.out.print(" ");
            }
            if (i==7) continue;
            System.out.println();
        }


    }

}
