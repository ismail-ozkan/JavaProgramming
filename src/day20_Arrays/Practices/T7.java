package day20_Arrays.Practices;

public class T7 {
/*
7. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8,9,10,1};

        for (int i = 0; i < arr1.length; i++) {
            int num = arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                if (num==arr2[j]){
                    System.out.print(num+" ");
                }

            }
        }


    }

}
