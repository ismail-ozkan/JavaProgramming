package MySelf.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class FirstMissingPositive {

    public static void main(String[] args) {

        int[] nums = {7,8,9,11,12};

        System.out.println(firstMissingPositive(nums));

    }


    public static int firstMissingPositive(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        ArrayList<Integer> posList = new ArrayList<>();
        for (int num : nums) {
            if (num > 0) {
                posList.add(num);
            }
        }
        int maxNumber = 1234567890;

        for (int i = 1; i < maxNumber; i++) {
            if (!posList.contains(i)) {
                result= i;
                break;
            }
        }
        return result;
    }

}
/*
Given an unsorted integer array nums, return the smallest missing positive integer.

You must implement an algorithm that runs in O(n) time and uses constant extra space.



Example 1:

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.


Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
 */