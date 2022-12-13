package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {
        // hourlyRate, weeklyHours

        int hourlyRate = 16;
        int weeklyHours = 40;
        int numberOfWeeks = 52;
        int salary = hourlyRate * weeklyHours * numberOfWeeks;

        // System.out.println(salary);
        // instead of above useage, we can use soutv shortcut for below exampels:

        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("hourlyRate = +" + hourlyRate);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary = $" + salary);

        // whenever we want to calculate any salary for any hour rate and any weekly hours, we may change them at when we want
    }

}
