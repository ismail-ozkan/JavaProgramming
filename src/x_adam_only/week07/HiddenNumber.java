package x_adam_only.week07;

import java.util.Random;
import java.util.Scanner;

import java.util.Random;
import java.util.Scanner;

public class HiddenNumber {


    public static void main(String[] args) {

        Random random = new Random();

        int hiddenNumber = random.nextInt(10) + 1;//0 inclusive and 10 is exclusive because of that we add +1
        // and distance is from 1 to 10.

        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Enter a number");
            int searchedNumber = scan.nextInt();
            if (searchedNumber == hiddenNumber) {
                System.out.println("Congrast, you find");
                flag = false;
            } else System.out.println("try again");
        } while (flag);

    }
}
/*
Task 1: Find the number that given a hidden number between 1 and 100 randomly created.

 Hint:   Random random=new Random();

        int hiddenNumber = random.nextInt(100) + 1;
 */


