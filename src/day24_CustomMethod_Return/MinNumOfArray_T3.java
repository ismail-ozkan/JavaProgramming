package day24_CustomMethod_Return;

public class MinNumOfArray_T3 {

    public static void main(String[] args) {

        int[] myArray = {1,2,5,4,6,88,44,55,333,54,644,45,245,21,74};

        int result = minNumInArray(myArray);

        System.out.println(result+" is the smallest number in the array.");


    }

    //3. create a method that can return the minimum number from an array of integers
    public static int minNumInArray(int[] intArray) {

        int minNum = intArray[0];
        for (int each : intArray) {
            if (each<=minNum){
                minNum=each;
            }
        }

        return minNum;
    }

}
