package day44_Abstraction.animalTask;

public interface WildAnimal {

   /* public static final boolean isWild = true; // static & final

    public abstract void hunt();*/

    boolean isWild = true; // static & final

    void hunt();// abstract

    static void a(){
        System.out.println("aa ");
    }
    default void b(){
        System.out.println("bb");
    }

}
