package day39_Recap.deviceTask;

public class MyDevices {

    public static void main(String[] args) {

        Samsung samsung = new Samsung("A71",10000);

        samsung.call(155284);

        Laptop laptop = new Laptop("ASUS","L550",15000);

        laptop.code();

        Iphone iphone = new Iphone("8",15500);
        iphone.faceTime(1505512);
    }

}
