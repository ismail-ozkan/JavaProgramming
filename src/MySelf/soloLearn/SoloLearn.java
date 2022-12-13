package MySelf.soloLearn;

import java.util.ArrayList;

import static java.lang.Integer.valueOf;

public class SoloLearn {

    public static void main(String[] args) {

        String givenStr = "4091131560563988";
        isValidCreditCardNo(givenStr);

    }

    private static void isValidCreditCardNo(String str) {

        // in order to set all number in the Arraylist in reverse order
        ArrayList<Integer> reverseList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            Integer a = Integer.valueOf(str.charAt(i));
            reverseList.add(a);
        }
        ArrayList<Integer> mult2List = new ArrayList<>();
        for (Integer integer : reverseList) {
            mult2List.add(integer*2);
        }
        for (int i = 0; i < mult2List.size(); i++) {
            int each = mult2List.get(i);
            if (each>9) {
                mult2List.set(i,each-9);
            }
        }
        int sum = 0;
        for (Integer each : mult2List) {
            sum+=each;
        }
        if (sum%10==0){
            System.out.println("Credit Card Number is valid");
        } else{
            System.err.println("Credit Card Number is NOT valid");
        }

    }

}
/*
You need to verify if the given credit card number is valid. For that you need to use the Luhn test.

Here is the Luhn formula:

Reverse the number.
Multiple every second digit by 2.
Subtract 9 from all numbers higher than 9.
Add all the digits together.
Modulo 10 of that sum should be equal to 0.
Task:
Given a credit card number, validate that it is valid using the Luhn test. Also, all valid cards must have exactly 16 digits.

Input Format:
A string containing the credit card number you need to verify.

Output Format:
A string: 'valid' in case the input is a valid credit card number (passes the Luhn test and is 16 digits long),
or 'not valid', if it's not.

Sample Input:
4091131560563988

Sample Output:
valid

Explanation: Let's run the Luhn test for our input:
Reverse: 8893650651311904
Multiplying the even positions by 2: 8 16 9 6 6 10 0 12 5 2 3 2 1 18 0 8
Subtract 9 from >9: 8 7 9 6 6 1 0 3 5 2 3 2 1 9 0 8
The sum: 70
70 Modulo 10 is 0.
The input passed the Luhn test and contains 16 digits, making it a valid credit card number
 */