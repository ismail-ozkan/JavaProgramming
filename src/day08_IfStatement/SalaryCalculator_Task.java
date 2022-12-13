package day08_IfStatement;

public class SalaryCalculator_Task {

    public static void main(String[] args) {
//hourlyRate, weeklyHours, stateTaxRate, federalTaxRate
        int hourlyRate, weeklyHours, stateTaxRate, federalTaxRate;
        int SalaryBeforeTax,
                stateTax,
                federalTax,
                totalTax,
                salaryAfterTax;

        hourlyRate = 50;
        weeklyHours = 45;
        stateTaxRate = 6;
        federalTaxRate = 26;


        SalaryBeforeTax = hourlyRate * weeklyHours * 52;
        stateTax = SalaryBeforeTax * 6 / 100;
        federalTax = SalaryBeforeTax * 26 / 100;
        totalTax = stateTax + federalTax;
        salaryAfterTax = SalaryBeforeTax - totalTax;


        System.out.println("Gross pay is: $"+SalaryBeforeTax);
        System.out.println("Federal tax is: $"+federalTax);
        System.out.println("State tax is: $"+stateTax);
        System.out.println("Total tax is: $"+totalTax);
        System.out.println("Net income is: $"+salaryAfterTax);
    }
}
/*
3. Create a class called SalaryCalculator.java
			3.1 declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

			3.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax

					Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

			3.3 use print statement to print each of the above
				Ex:
					   hourlyRate = $50
					   weeklyHours = 45
					   stateTaxRate = 6 (given as percentage, you need to convert to decimal)
					   federalTaxRate = 26 (given as percentage, you need to convert to decimal)

				    output:
				    	Gross pay is: $117000
				    	Federal tax is: $30420
			    		State tax is: $7020
			    		Total tax is: $37440
			    		Net income is: 79560
 */