package day24_CustomMethod_Return;

public class MaxNumOfArray_T2 {

    public static void main(String[] args) {

        int[] myArray = {1,2,5,4,6,88,44,55,333,54,644,45,245,21,74};

        int result = maxNumInArray(myArray);
        System.out.println(result+" is the maximum number in the array.");
    }


    //2. create a method that can return the maximum number from an array of integers
    public static int maxNumInArray(int[] intArray) {

        int maxNum = intArray[0];

        for (int each : intArray) {
            if (each>=maxNum){
                maxNum=each;
            }
        }
        return maxNum;
    }

}
