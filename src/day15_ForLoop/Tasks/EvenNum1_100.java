package day15_ForLoop.Tasks;

import java.util.Scanner;

public class EvenNum1_100 {

    public static void main(String[] args) {
        String result = "";
        for (int i = 1; i<101; i++) {
            if (i%2==0) {
                //System.out.print(i+" ");
                result += i + " ";
            }
        }
        System.out.println(result);

        Scanner scan = new Scanner(System.in);

        int goThere = scan.nextInt();

        for (int i = 0; i<=goThere; i++) {
            if (i%2==0) System.out.print(i+" ");
        }

    }

}

