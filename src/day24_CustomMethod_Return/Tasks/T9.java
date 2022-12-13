package day24_CustomMethod_Return.Tasks;

import java.util.Arrays;

public class T9 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        int num = 10;
        System.out.println(contains(arr, num));

    }

    public static boolean contains(int[] array, int parameter) {
        boolean result = false;
        for (int each : array) {
            if (each==parameter) {
                result = true;
            }
        }
        return result;
    }
}
/*
9. Create a method named contains that passes one integer array and one integer parameters,
 the method returns true if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false

 */