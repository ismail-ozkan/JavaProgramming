package day33_Statics;

public class Iphone {

    public static String brand = "Apple";

    public String model;

    public int price = (model.equals("12"))? 200 : 100;

    public static String OS = "iOS";

    public String color;

    public String size;

    public static String madeIn = "China";

    public static boolean hasBattary = true;

    public static boolean isTouchScreen = true;

    public static boolean hasFaceTime = true;


    //public static void printModelAndPrice(){
    //    System.out.println(model+ " : " + price);
    //}

    public void method1(){
        System.out.println(model+" : "+price);
    }

    public static void printOperatingSystem(){
        System.out.println(OS);
    }












}
