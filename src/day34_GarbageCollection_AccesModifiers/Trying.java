package day34_GarbageCollection_AccesModifiers;

public class Trying {

    public String firstName;
    public String secondName;
    public static String lastName;

    public Trying(String firstName){
        System.out.println("Constructor is working");
        System.out.println(firstName+" "+lastName);
        this.firstName = firstName;
    }

    public Trying(String firstName, String secondName) {
        this(firstName);// it doesn't work in second line in this constructor
        this.secondName = secondName;
    }

    static {
        lastName = "özkan";
        System.out.println("Static block is working-- static block runs first before everything, only runs one time");
    }

    public String toString() {
        return "Trying{" +
                "firstName='" + firstName + '\'' +
                "lastname='" + lastName + '\'' +
                "toString is working"+ '\'' +
                '}';
    }
}
