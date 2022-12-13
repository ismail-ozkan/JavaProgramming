package x_adam_only.MyCalculator;

public class MyCalculator1 {

    public int plus(int num1, int num2){
        return num1+num2;
    }
    public int minus(int num1, int num2){
        return num1-num2;
    }
    public int multiply(int num1, int num2){
        return num1*num2;
    }
    public int divide(int num1, int num2){
        return num1/num2;
    }

}

class MyCalculator2 {

    public int num1;
    public int num2;

    public MyCalculator2(int num1, int num2){//constructor
        this.num1 = num1;
        this.num2 = num2;
    }
    public int plus(){
        return num1+num2;
    }
    public int minus(){
        return num1-num2;
    }
    public int multiply(){
        return num1*num2;
    }
    public int divide(){
        return num1/num2;
    }
}

class CalculatorObjects{
    MyCalculator_1 calc1 = new MyCalculator_1();
    int result1 = calc1.plus(12,21);
    int result2 = calc1.minus(21,12);
    int result3 = calc1.multiply(21,12);
    int result4 = calc1.divide(21,12);

    MyCalculator_2 calc2 = new MyCalculator_2(21,12);

    int res1 = calc2.plus();
    int res2 = calc2.minus();
    int res3 = calc2.multiply();
    int res4 = calc2.divide();
}