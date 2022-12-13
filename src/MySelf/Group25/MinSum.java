package MySelf.Group25;

import java.util.Arrays;

public class MinSum {

    public static void main(String[] args) {

        int[] nums = {10, 20, 7};
        int k = 4;
        //System.out.println(minSum(nums, k));
        System.out.println(minSum2(nums, k));
    }

    public static int minSum(int[] arr, int k){
        // in order to return the result
        int result = 0;
        //in order to pick the biggest one
        for (int i = 0; i < k; i++) {//to execute k times
            // to sort all array
            Arrays.sort(arr);
            double temp = arr[arr.length-1];// to chose big one
            temp = (temp/2)+0.5;// to get the ceiling of the number
            arr[arr.length-1] = (int)temp;// to change the big one by division by 2
        }
        for (int each : arr) {// to add all
            result+=each;
        }
        return result;
    }


    // 2. SOLUTION
    public static int minSum2(int[] arr, int k){//to execute k times
        // in order to return the result
        int result = 0;
        //in order to pick the biggest one
        for (int j = 0; j < k; j++) {
            int bigIndex = 0;
            double biggest = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (biggest<=arr[i]) {
                    biggest=arr[i];
                    bigIndex = i;
                }
            }
            biggest = biggest/2+0.5;
            arr[bigIndex] = (int) biggest;
        }

        for (int each : arr) {
            result+=each;
        }
        return result;
    }

}
