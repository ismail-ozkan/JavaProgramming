package MySelf;

import java.util.ArrayList;

public class Family {

    public String name;
    public int age;

    private int priveteCodeForThisClass = 471954;

    public static String lastName = "özkan";// static variable

    public static ArrayList<Integer> listOf1to100;

    static {
        System.out.println("static block is running first");
        listOf1to100 = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            listOf1to100.add(i);
        }
    }


    public Family(String name) {
        this.name = name;
    }
    public Family(String name,int age) {
        this(name);
        this.age = age;
    }
    public void who(){
        System.out.println(name);
        System.out.println(lastName);
    }

    public static void ages(){
        // I cannot use instance variables in this static method
    }

    public static void lastName(){
        System.out.println(lastName);
    }

    public static String lastName2(){
        return lastName;
    }

    private void usingPrivate(){
        System.out.println("private method");
    }
    public void ageOfMember(){
        System.out.println(age);
        usingPrivate();
    }





}
