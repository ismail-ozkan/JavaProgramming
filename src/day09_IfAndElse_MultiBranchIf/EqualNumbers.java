package day09_IfAndElse_MultiBranchIf;

import java.util.Scanner;

public class EqualNumbers {

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);
        System.out.println("Please enter 3 number for comparison of equality:");

        int n1 = inputs.nextInt();
        int n2 = inputs.nextInt();
        int n3 = inputs.nextInt();


        if (n1==n2 && n2==n3) {
            System.out.println("all equal");
        } else if (n1==n2) {
            System.out.println("n1&n2 are equal");
        } else if (n2==n3) {
            System.out.println("n2&n3 are equal");
        } else if (n1==n3) {
            System.out.println("n3&n1 are equal");
        }else {
            System.out.println("none of them are equal");
        }

    }

}
