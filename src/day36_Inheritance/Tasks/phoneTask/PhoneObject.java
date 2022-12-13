package day36_Inheritance.Tasks.phoneTask;

public class PhoneObject {

    public static void main(String[] args) {

        IPhone iPhone1 = new IPhone();
        iPhone1.setInfo("8i","middle",10000,"gold");
        IPhone iPhone2 = new IPhone();
        iPhone2.setInfo("xxx","8i","middle",10000,"gold");

        iPhone1.faceTime(750363499);
        System.out.println(iPhone1);//IPhone{brand='Iphone',
        System.out.println(iPhone2);//IPhone{brand='Iphone',

        Samsung samsung1 = new Samsung();
        samsung1.setInfo("Samsung","A8","Large",7500,"Black");


    }

}
