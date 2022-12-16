package day39_Recap.deviceTask;

public class Iphone extends Phone{
    public Iphone(String model, double price) {
        super("Iphone", model, price);
    }

    public void faceTime(long phoneNum){
        System.out.println(getBrand()+" "+getModel()+" is face timing with "+phoneNum);
    }

    public void faceTime(String email){
        System.out.println(getBrand()+" "+getModel()+" is face timing with "+email);
    }
}
