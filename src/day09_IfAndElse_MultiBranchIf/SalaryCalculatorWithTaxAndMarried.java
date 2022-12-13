package day09_IfAndElse_MultiBranchIf;

public class SalaryCalculatorWithTaxAndMarried {

    public static void main(String[] args) {

        int salary = 80_000;
        boolean isMaried = false;
        double taxRate = 0;
        double salaryAfterTax = 0;

        if (salary>=130_000) {// false : salary <130000
            taxRate = 0.35;
        } else if (salary>=100_000) {
            taxRate = 0.30;
        } else if (salary>=80_000) {
            taxRate = 0.25;
        } else {
            taxRate = 0.20;
        }

        if (isMaried) {
            taxRate -= 0.05;
        }

        salaryAfterTax = salary - (salary * taxRate);
        System.out.println("salaryAfterTax = " + salaryAfterTax);


/*MY Solution
        if (!isMaried){
            if (salary<80_000) {
                taxRate = 20;
            } else if (salary>=80_000 && salary<100_000) {
                taxRate = 25;
            } else if (salary>=100_000 && salary<130_000) {
                taxRate = 30;
            } else {
                taxRate = 35;
            }
        } else {
            if (salary<80_000) {
                taxRate = 20-5;
            } else if (salary>=80_000 && salary<100_000) {
                taxRate = 25-5;
            } else if (salary>=100_000 && salary<130_000) {
                taxRate = 30-5;
            } else {
                taxRate = 35-5;
            }
        }

        int salaryAfterTax = salary * (100 - taxRate) / 100;
        System.out.println("salaryAfterTax = " + salaryAfterTax);
 */




    }

}
/*
2. Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                35% for salary of 130K or more
      			30% for salary of 100K to 130k (excluded)
      			25% for salary of 80K to 100K (excluded)
      			20% for salary less than 80K

                in addition, if the person is married, he/she will pay 5% less tax
 */