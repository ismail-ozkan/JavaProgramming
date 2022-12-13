package day23_CustomMethods_Void.Tasks;

public class T12 {

    public static void main(String[] args) {

        int number = 13;
        zeroPosNeg(number);

    }

    //12. create a method that can if the given integer is positive, negative or zero
    public static void zeroPosNeg(int number) {

        String result = (number==0)? "Zero": (number<0)? "Negative" : "Positive";

        System.out.println(result);
    }

}
