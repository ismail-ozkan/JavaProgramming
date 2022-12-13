package day04_Variables;

public class Currencies {

    public static void main(String[] args) {

        int dollar = 1000;

        double lira = dollar * 18.53;
        double euro = dollar * 1.16;
        // jpy, pound, peso, cad, riyal, rub
        double rub = dollar * 59.98;
        double jpy = dollar * 114.14;
        double pound = dollar * 0.73;
        double riyal = dollar * 3.76;


        System.out.println(dollar + "$ equal " + lira + "TL" );
        System.out.println("dollar = " + dollar);
        System.out.println("lira = " + lira);
        System.out.println("riyal = " + riyal);
        System.out.println("jpy = " + jpy);
        System.out.println("euro = " + euro);

    }

}
