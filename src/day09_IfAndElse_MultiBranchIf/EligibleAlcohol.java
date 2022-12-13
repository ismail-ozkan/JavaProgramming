package day09_IfAndElse_MultiBranchIf;

public class EligibleAlcohol {

    public static void main(String[] args) {

        int age = 22;

        boolean isEligible = age >= 20;

        if (isEligible){
            System.out.println("Eligible");
        }else {
            System.out.println("Not Eligible");
        }
    }
}
