package day18_NestedLoop.Tasks;

import java.util.Scanner;

public class T3_CalculateTwoNum {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        double result = 0;

        while (true) {

            System.out.println("Enter the first number: ");
            double num1 = scan.nextInt();

            System.out.println("Enter a math operator (+,-,/,*)");
            char oper = scan.next().charAt(0);

            while (!(oper=='+'||oper=='-'||oper=='*'||oper=='/')) {
                System.err.println("Invalid Operator");
                System.out.println("Enter a math operator (+,-,/,*)");
                oper = scan.next().charAt(0);
            }
            System.out.println("Enter the second number");
            double num2 = scan.nextInt();
            if (oper=='+') {
                result= num1+num2;
            } else if (oper =='-') {
                result=num1-num2;
            } else if (oper =='*') {
                result=num1*num2;
            } else {
                result=num1/num2;
            }


            System.out.println("result "+ result);


            System.out.println("Do you want to continue? (yes/no)");
            String yesNo = scan.next().toLowerCase();
            while (!(yesNo.equals("yes")||yesNo.equals("no"))) {
                System.out.println("Invalid entry, re-enter please");
                yesNo = scan.next().toLowerCase();
            }
            if (yesNo.equals("no")) {
                System.out.println("Thanks for using Cydeo calculator!");
                break;
            }

        }
    }

}
