package day12_Scanner;

import java.util.Scanner;

public class AboutScanner {

    public static void main(String[] args) {

        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // variables are already declared, all you have to do is to use the variables that are given


        Scanner text = new Scanner(System.in);
        int num = text.nextInt();
        double cost = text.nextDouble();

        //write your code here:

        System.out.println("num= " + num);
        System.out.println("cost= " + cost);

    }

}
