package ZulpikarOnly;

public class Task12345 {

    public static void main(String[] args) {


        for (int i = 0, j = 1; i < 10; i++) {
            if (i%2==1){
                System.out.print(" ".repeat(10 - i));
                System.out.print(((j++)+"").repeat(i));
                System.out.println();
            }
        }



    }

}