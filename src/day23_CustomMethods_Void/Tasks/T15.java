package day23_CustomMethods_Void.Tasks;

public class T15 {

    public static void main(String[] args) {

        calculater(15, 2,'/');

    }

    //15. create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result
    public static void calculater(int num1, int num2, char mathOperator) {

        double result = 0.0;
        if (mathOperator=='+'||mathOperator=='-'||mathOperator=='*'||mathOperator=='/'){
            switch (mathOperator) {
                case '+':
                    result=num1+num2;
                    break;
                case '-':
                    result=num1-num2;
                    break;
                case '*':
                    result=num1*num2;
                    break;
                default:
                    result=num1/1.0/num2;
                    break;
            }
        }
        System.out.println(result);


    }

}
