package day08_IfStatement;

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate = 50,
                weeklyHours = 45;

        double stateTaxRate = 6.5,// %6.5 is the rate and in order to find to tax amount we multiply salary by (6.5/100 = %6.5)
                federalTaxRate = 26.2;

        //------------------------------------
        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;
        //-------------------------------------
        System.out.println("Groos pay is: $" + salaryBeforeTax);
        System.out.println("State Tax = $" + stateTax);
        System.out.println("Federal Tax = $" + federalTax);
        System.out.println("Total Tax = $" + totalTax);
        System.out.println("Net Income = $" + salaryAfterTax);

        int a = 10;
        System.out.println(a++ +" and "+ ++a);
    }

}
