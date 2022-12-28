package Day42_Exceptions;

public class DisadvantageOfThrowsKeyword {


    public static void main(String[] args) {

        System.out.println("Hello");

       // sleep(2.5); // throws

        System.out.println("Hello World");

        System.out.println("------------------");

        System.out.println("Hello");

        MorningWorkOut.sleep(2.5);


        System.out.println("Hello World");


    }


    public static void sleep(double seconds) throws InterruptedException {


            Thread.sleep((long)(seconds*1000));// casting data type double to long

    }

}
