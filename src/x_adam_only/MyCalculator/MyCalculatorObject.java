package x_adam_only.MyCalculator;

public class MyCalculatorObject {

    public static void main(String[] args) {

        MyCalculator_1 calc1 = new MyCalculator_1();
        int result1 = calc1.plus(12,21);
        int result2 = calc1.minus(21,12);
        int result3 = calc1.multiply(21,12);
        int result4 = calc1.divide(21,12);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println("----------------------------------------");

        MyCalculator_2 calc2 = new MyCalculator_2(21,12);

        int res1 = calc2.plus();
        int res2 = calc2.minus();
        int res3 = calc2.multiply();
        int res4 = calc2.divide();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
    }

}
