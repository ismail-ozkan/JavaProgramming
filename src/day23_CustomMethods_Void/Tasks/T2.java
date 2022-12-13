package day23_CustomMethods_Void.Tasks;

public class T2 {

    public static void main(String[] args) {

        evenNumber1_100();

    }

    public static void evenNumber1_100() {

        for (int i = 1; i <= 100; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }

    }

}
