package MySelf;

public class ReverseInteger {
    public static void main(String[] args ) {

        reverseInteger(12345);


    }

    public static void reverseInteger(int num) {

        String length = ""+num;
        int result = 0;
        //1234
        do {
            int lastFigure = num%10;//4
            result+=lastFigure;//3
            result*=10;//30
            num/=10;//15

        } while (num>0);
        System.out.println(result/10);
    }
}
