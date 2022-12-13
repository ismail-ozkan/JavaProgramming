package day23_CustomMethods_Void.Tasks;

public class T9 {

    public static void main(String[] args) {

        int dolar = 10;
        dolarToEuro(dolar);

    }

//9. create a method that can convert dollar to euro
    public static void  dolarToEuro(int dolar) {

        double euro = dolar*1.2;
        System.out.println(dolar+"$ equls "+euro+"€.");
    }

}
