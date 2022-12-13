package day09_IfAndElse_MultiBranchIf;

public class MinNumber {

    public static void main(String[] args) {

        int num1 = 100,
                num2 = 200;


        boolean isMin1 = num1 < num2;
        boolean isMin2 = num2 < num1;// boolean isMin2 = !isMin1
        boolean equality = num1 == num2;
        if (isMin1){
            System.out.println(num1 + " is minumum number.");
        }
        if (isMin2){
            System.out.println(num2 + " is minumum number.");
        }
        if (equality){
            System.out.println(num1 + " and " + num2 + " is equal.");
        }
    }
}
