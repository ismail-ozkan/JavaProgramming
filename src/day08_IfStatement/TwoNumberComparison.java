package day08_IfStatement;

public class TwoNumberComparison {

    public static void main(String[] args) {

        int number1 = 100,
                number2 = 200;


        if (number1>number2){
            System.out.println(number1 + " is maximum number");
        }else if (number1<number2) {
            System.out.println(number2 + " is maximum number");
        }else {
            System.out.println(number1 + " and " + number2 + " are equal.");
        }

    }
}
