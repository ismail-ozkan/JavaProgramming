package day44_Abstraction.carTask;

public interface AutoPark {

    public final static boolean hasAutoPark = true;// it's not a instance variable// but static variable


    public abstract void autoPark();
    public static void methodStatic(){
        System.out.println("This is static");
    }


}
