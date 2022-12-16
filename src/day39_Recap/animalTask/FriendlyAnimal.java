package day39_Recap.animalTask;

public class FriendlyAnimal extends Animal{

    public static boolean isWild = false;
    public static boolean isFriendly = true;
    public static boolean isPlayable = true;

    public FriendlyAnimal(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    public void play(){
        System.out.println(getName() + " is playing");
    }
    public void pet(){
        System.out.println(getName() + " likes being petted");
    }

    @Override
    public String toString() {
        return "FriendlyAnimal{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "  isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
    }
}
