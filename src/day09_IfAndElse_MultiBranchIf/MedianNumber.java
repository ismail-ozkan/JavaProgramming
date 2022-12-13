package day09_IfAndElse_MultiBranchIf;

public class MedianNumber {

    public static void main(String[] args) {

        // if we have three different number
        // one must be maximum
        // one must be minumum and
        // other one must be median number
        int a = 10,
                b = 15,
                c = 20;

        boolean forA = (a > b && a < c) || (a < b && a > c);//  b > a > c or c > a > b
        boolean forB = (b > a && b < c) || (b < a && b > c);//  a > b > c or c > b > a
        boolean forC = (c > a && c < b) || (c < a && c > b);// a > c > b or b > c > a
        //      forC = !forA && forB!

        if (forA) {
            System.out.println(a + " is the median number between three number.");
        }
        if (forB) {
            System.out.println(b + " is the median number between three number.");
        }
        if (forC) {
            System.out.println(c + " is the median number between three number.");
        }
    }
}
