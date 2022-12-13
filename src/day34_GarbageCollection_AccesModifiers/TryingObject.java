package day34_GarbageCollection_AccesModifiers;

public class TryingObject {

    public static void main(String[] args) {

        Trying try1 = new Trying("ismail");

        System.out.println(try1);
        System.out.println(try1.toString());// toString method for getting easier to print object

        System.out.println(Trying.lastName);
    }

}
