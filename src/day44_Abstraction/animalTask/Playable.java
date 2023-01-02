package day44_Abstraction.animalTask;

public interface Playable {

    boolean isFriendly = true;

    void play();

    public static boolean method(){
        System.out.println(isFriendly);
        return true;
    }

}
