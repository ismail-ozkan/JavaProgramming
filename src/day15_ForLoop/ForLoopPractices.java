package day15_ForLoop;

public class ForLoopPractices {

    public static void main(String[] args) {


        for (int i  = 15; i <= 45; i++) {// i: 15 16..... 45 ----> 31 times
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("Hello");

        for (int i = 100; i >= 50 ; i-- ) {// 51 times
            System.out.print(i + " ");
        }

        System.out.println("----------------------------");

        // print all even numbers between 1-55

        for (int i = 1; i<=55; i++) {

            if (i % 2 == 0) {
                System.out.print(i+" ");

            }
        }
        System.out.println();

        System.out.println("--------------------------------------");
        // print all even numbers between 1-55

        for (int i = 2; i <=54; i+=2) {
            System.out.print(i+" ");
        }

        System.out.println("--------------------------------------");

        int a = 1;
        for (int i = 1; i <= 54; i+=2) {
            System.out.print(i + a+" ");
        }




    }

}
