package day20_Arrays;

public class AverageNumbers {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }

        double length = numbers.length;
        System.out.println("Avarage: "+(sum/length));


    }

}
