package day21_ForEachLoop.Tasks;

public class T2 {
/*
2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */
    public static void main(String[] args) {

        int[] numbers = {6,3,1,4,7,5,2};
        int numOfOdd = 0;
        int numOfEven = 0;
        for (int n : numbers) {
            if (n%2==0) numOfEven++;
            if (n%2==1) numOfOdd++;
        }
        System.out.println("numOfEven = " + numOfEven);
        System.out.println("numOfOdd = " + numOfOdd);


    }

}
