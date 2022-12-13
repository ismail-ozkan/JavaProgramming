package x_adam_only.week09;

public class Armstrong {

    public static void main(String[] args) {


        int number = 371;
        isArmstrong(number);


    }

    public static void isArmstrong(int num) {
        //153
        String length = ""+num;
        int originalCopy = num;
        int result = 0;

        for (int i = 0; i < length.length(); i++) {
            int powerOf3 = 0;
            int each = num%10;
            powerOf3 = each*each*each;
            result+= powerOf3;
            num/=10;
        }
        if (originalCopy==result) {
            System.out.println(originalCopy + " is armstrong number");
        }else {
            System.out.println(originalCopy + " is not armstrong number");
        }
    }

}
/*
Task 3 :   Write a method that can check if a number is Armstrong number

          Note: if I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number.
          If the number obtained equals the original number then, we call that armstrong number.

                Armstrong numbers are     === 153 370 371 407 === for 3 digits

 */