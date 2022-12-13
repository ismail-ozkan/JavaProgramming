package day09_IfAndElse_MultiBranchIf;

public class PosNegZero {

    public static void main(String[] args) {

        int num = -35;

        boolean isPos = num > 0;
        boolean isNeg = num<0;
        // boolean isZero = num == 0; we souldn't use this boolean because we use multi-branch if statement

        if (isPos){
            System.out.println(num+" is positive");
        } else if (isNeg) {
            System.out.println(num+" is negative");
        }else {
            System.out.println(num+" is zero");
        }


    }
}
