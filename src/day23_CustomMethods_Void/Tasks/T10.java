package day23_CustomMethods_Void.Tasks;

public class T10 {

    public static void main(String[] args) {
        
        int dolar = 13;

        dollarToLira(dolar);

    }

    public static void dollarToLira(int dollar) {

        double tL = dollar/18.6;
        System.out.println(tL);
    }

}
