package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        // assignment: =
        int number = 100;

        System.out.println("number = " + number);//100

        number = 200;// in this line we only update valuable
        System.out.println("number = " + number); // 200

        //if we write int num = 200; this time we try to assign a new value ,but we cant do
        // because variable's name must be unique

        String word = "Java Proramming";

        System.out.println("word = " + word);

        word = "Wooden Spoon";

        System.out.println("word = " + word);

        word = "Cydeo";

        System.out.println("word = " + word);

        // word  = 123; XXX its not possible

        // word = "123" + 1;  // 1231
        word = "Java Programming";

        System.out.println("word = " + word);

        System.out.println("------------------------------");

        // Addition Assignment

        int x = 100;

        System.out.println("x = " + x);

        System.out.println(x + 200); // x is 100 still but result //300

        x += 200;   // x is 300 anymore
        System.out.println("x = " + x);//300

        String str = "Wooden";

        str += " Spoon";
        System.out.println("str = " + str);

        double num1 = 2.5;

        num1 += 5.5;

        System.out.println("num1 = " + num1);   //8.0

        double availableBalance = 1000.50;

        //deposit 300$
        availableBalance += 300;

        System.out.println("availableBalance = " + availableBalance);//1300.5

        System.out.println("-----------------------");

        // withdrawing 500$

        availableBalance -= 500;

        System.out.println("availableBalance = " + availableBalance);// 1300.5 - 500 = 800.5


        // withdrawing 200, then depositing 400$

        availableBalance -= 200; // availableBalance = 600.5

        availableBalance += 400; // availableBalance = 1000.5;

        System.out.println("availableBalance = " + availableBalance);

        System.out.println("-----------------------");

        double salary = 50000.5;

        // afrer graduating from cydeo your salary is going double

        salary *= 2;

        System.out.println("salary = " + salary);//100001.0

        double dodge = 0.00000001;
        dodge *= 1000000;

        System.out.println("-----------------------");

        double num2 = 25000;

        num2 /= 2;

        System.out.println("num2 = " + num2);
        System.out.println("------------------------");

        double num3 = 100;

        // %=

        num3 %= 3;// 1.0(so it is decimal because num3 is double

        System.out.println("num3 = " + num3);


        int amount = 127;   // cents

        int quarters = 127 / 25;
        int cents = amount % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("----------------------");

        int amount2 = 127;

        amount2 %= 3;
        System.out.println("amount2 = " + amount2);

    }

}
