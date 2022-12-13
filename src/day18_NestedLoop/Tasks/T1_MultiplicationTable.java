package day18_NestedLoop.Tasks;

public class T1_MultiplicationTable {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j);
                if (j==10) continue;
                System.out.print("\t");
            }
            if (i==10) continue;
            System.out.println();
        }

    }

}
