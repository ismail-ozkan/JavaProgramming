package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = +25;// + operator is optional so it is not required
        int num2 = -25;// we must use - operator

        System.out.println(num1 < 0); // false
        System.out.println(num2 < 0); // true


        System.out.println("---------------------");

        //PRE Operators
        int a = 5;
        ++a;    //pre-increment operator: increases the value by 1 right away
        System.out.println(a);// 6

        --a;    // pre-decrement operator: decreases the value by 1 right away
        System.out.println(a); // again 5

        System.out.println("-----------------------");

        //POST Operators

        int b = 100;
        System.out.println(++b);//101
        System.out.println(b); // 101

        int c = 100;

        System.out.println(c++); // post increment // 100 but after if we call c, then c = 101 !!!
        System.out.println(c); //101

        int d = 200;
        System.out.println(--d);// pre decrement change value just right, and value change in this(first) line

        int e = 300;
        System.out.println(e--);// post decrement change the value after using is printed 300
        System.out.println(e); // is printed 301

        int q = 30;

        System.out.println(--q);//29
        System.out.println(q--);//29 ,q = 28 yet
        System.out.println(q);//28





    }
}
