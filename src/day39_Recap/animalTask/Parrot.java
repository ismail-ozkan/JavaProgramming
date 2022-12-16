package day39_Recap.animalTask;

public class Parrot extends FriendlyAnimal{

    public Parrot(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating sesame");
    }
    public void fly() {
        System.out.println(getName() + " is flying");
    }
    public void sing() {
        System.out.println(getName() + " is singing");
    }
}
