package day24_CustomMethod_Return;

import java.util.Arrays;

public class MergeArrays_T5 {

    public static void main(String[] args) {

        int[] posNumArr = {1,2,3,4};
        int[] negNumArr = {-2,-6,-8,-5};

        int[] sum = mergeArrays(posNumArr,negNumArr);

        System.out.println(Arrays.toString(sum));

    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {

        int[] mergedArr = new int[arr1.length+arr2.length];
        int c = 0;
        for (int each1 : arr1) {
            mergedArr[c++] = each1;
        }
        for (int each1 : arr2) {
            mergedArr[c++] = each1;
        }


        return mergedArr;
    }

}
