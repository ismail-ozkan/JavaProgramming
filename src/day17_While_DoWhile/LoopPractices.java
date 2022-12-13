package day17_While_DoWhile;

public class LoopPractices {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {// if the number of repetition is known in advance
            System.out.println(i);
        }
        System.out.println("----------------------------------");

        int j=1;
        while(j<=10) {
            //j++; ---> it is different from the following statement //2,3,4,5,...
            System.out.println(j);
            j++;//1,2,3,4,5,...
        }

        System.out.println("----------------------------------");
        int k=1;
        do {
            System.out.println(k);
            k++;
        }while (k<=10);


    }

}
