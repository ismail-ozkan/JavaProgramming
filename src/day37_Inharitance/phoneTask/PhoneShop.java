package day37_Inharitance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "6.7 inches", 1000, "Black");

        Samsung samsung = new Samsung("galaxy S19", "6 inches", 900, "White");

        Nokia nokia = new Nokia("Brick", "4 inches", 50, "Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(112);
        iphone.text(112123121);
        iphone.facetime(1452228);
        iphone.facetime("ismoza@hmail.com");
        System.out.println("---------------------------");
        samsung.call(112);
        samsung.text(112123121);
        samsung.freeze();
        System.out.println("---------------------------");
        nokia.call(112);
        nokia.text(112123121);
        nokia.selfDefense();
        System.out.println("---------------------------");


    }

}
