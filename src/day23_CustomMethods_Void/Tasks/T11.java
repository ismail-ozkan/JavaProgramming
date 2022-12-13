package day23_CustomMethods_Void.Tasks;

public class T11 {

    public static void main(String[] args) {


        int kg = 15;
        kgToLb(kg);

    }

    //11. create a method that can convert kg to lb

    public static void kgToLb(int kg) {

        double lb = kg* 2.204;

        System.out.println(lb);

    }


}
