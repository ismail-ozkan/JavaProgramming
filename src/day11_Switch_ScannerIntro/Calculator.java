package day11_Switch_ScannerIntro;

public class Calculator {

    public static void main(String[] args) {

        double n1 = 220.3, n2 = 31.1;
        char operator = '/';

        boolean isValid = operator=='+' || operator=='-' || operator== '*' || operator== '/';

        if (isValid) {// pre-condition operator

            switch (operator){

                case '+':
                    System.out.println("n1 + n2 = " + (n1 + n2));
                    break;

                case '-':
                    System.out.println(n1 - n2);
                    break;

                case '*':
                    System.out.println(n1 * n2);
                    break;

                default:
                    System.out.println(n1 / n2);
                    break;// it is not necessary

            }

        } else {
            System.err.println("Invalid Operator: " + operator);
        }



    }

}
