package day23_CustomMethods_Void;

public class CustomMethodPractice {

    public static void main(String[] args) {

        helloWorld5Times();

        System.out.println("------------------------------------");

        helloCydeo5Times();

        System.out.println("------------------------------------");

        evenNumbers1_10();
    }

    // create a function that can print hello world 5 times ----> helloWorld5Times
    public static void helloWorld5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+". Hello World");
        }
    }

    // create a function that can print hello cydeo 5 times ----> helloCydeo5Times
    public static void helloCydeo5Times(){
        for (int i=0; i<5; i++){
            System.out.println((i+1)+". Hello Cydeo");
        }
    }


    public static void evenNumbers1_10() {
        for (int i = 2; i < 11; i++) {
            if (i%2==0) System.out.println(i);
        }
    }

}
