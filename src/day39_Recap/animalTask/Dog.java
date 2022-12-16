package day39_Recap.animalTask;

public class Dog extends FriendlyAnimal{

    public Dog(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating cat");
    }

    public void bark(){
        System.out.println(getName() + " is barking");
    }
}
