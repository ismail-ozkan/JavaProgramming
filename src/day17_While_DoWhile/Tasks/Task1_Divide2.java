package day17_While_DoWhile.Tasks;

public class Task1_Divide2 {

    public static void main(String[] args) {

        int num1 = 40;
        int num2 = 8;
        int result = 0;

        while (num1>=num2) {
            result++;
            num1-=num2;
        }

        System.out.println(result);


    }

}
