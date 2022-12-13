package day34_GarbageCollection_AccesModifiers;

public class Constructor_vs_StaticBlocks {


    static {
        System.out.println("Static Block");
    }

    public Constructor_vs_StaticBlocks(){// executing this Constructor block depends on OBJECTS
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        System.out.println("Main Method");

        new Constructor_vs_StaticBlocks();
        new Constructor_vs_StaticBlocks();
        new Constructor_vs_StaticBlocks();
        new Constructor_vs_StaticBlocks();
        new Constructor_vs_StaticBlocks();

    }

}
