package day09_IfAndElse_MultiBranchIf;

import java.util.Scanner;

public class MedianNumberWithScanner {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.println("Please enter three different number:");
        int a = number.nextInt(),
                b = number.nextInt(),
                c = number.nextInt();

        boolean forA = (a > b && a < c) || (a < b && a > c);
        boolean forB = (b > a && b < c) || (b < a && b > c);
        boolean forC = (c > a && c < b) || (c < a && c > b);
        //      forC = !forA && forB!


        if (forA) {
            System.out.println(a + " is the median number between three number.");
        }
        if (forB) {
            System.out.println(b + " is the median number between three number.");
        }
        if (forC) {
            System.out.println(c + " is the median number between three number.");
        }
    }
}
