package day24_CustomMethod_Return;

public class ReturnMethodPractice {

    public static void main(String[] args) {

        // find the max number between 100 & 200
        int maxNum = max(100, 200);

        System.out.println(maxNum);

        // multiply the max number by 2
        int multiplication = maxNum*2;

        System.out.println(multiplication);

        //int maxNum2 = max2(300,400); is not usable

    }

    public static int max(int a,int b){

        int result = 0;

        if (a > b){
            result = a;
        } else{
            result = b;
        }
        return result;

    }

    public static void max2(int c, int d) {

        int result2 = 0;

        if (c>d){
            result2 = c;
        } else {
            result2 = d;
        }

    }


}


