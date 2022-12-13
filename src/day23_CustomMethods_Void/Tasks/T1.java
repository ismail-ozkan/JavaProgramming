package day23_CustomMethods_Void.Tasks;

public class T1 {

    public static void main(String[] args) {

        oddNumber1_100();

    }

    public static void oddNumber1_100(){

        for (int i = 1; i <= 100 ; i++) {
            if (i%2==1)
                System.out.print(i+" ");
        }

    }

}
