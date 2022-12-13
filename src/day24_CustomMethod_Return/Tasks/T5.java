package day24_CustomMethod_Return.Tasks;

public class T5 {

    public static void main(String[] args) {

        int[] array ={1,1,1,1,1,2,2};

        System.out.println(frequency(array, 1));

    }

    public static int frequency(int[] array, int number) {
        int freq = 0;
        for (int each : array) {
            if (each==number){
                freq++;
            }
        }

        return freq;
    }

}
/*
5. create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5

 */