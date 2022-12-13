package MySelf.Group25;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        int[] numbers = {-1,5,2,7,8,6,0,9,3,4};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int temp = 0;  //everytime temp must be empty
                if (numbers[i] > numbers[j]){ //ascending order
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
                System.out.println(Arrays.toString(numbers));
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}