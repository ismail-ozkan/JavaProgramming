package day23_CustomMethods_Void.Tasks;

public class T14 {

    public static void main(String[] args) {

        int[] numbers = {1,25,65,9,71};

        printEachElement(numbers);

    }

    //4. create a method named printEachElement that can print each element of an integer array

    public static void printEachElement(int[] numbers) {

        for (int number : numbers) {
            System.out.println(number);
        }


    }


}
