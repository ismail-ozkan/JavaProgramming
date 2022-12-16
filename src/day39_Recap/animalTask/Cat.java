package day39_Recap.animalTask;

public class Cat extends FriendlyAnimal {

    public Cat(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating mouse");
    }

    public void scratch() {
        System.out.println(getName() + " is scratching");
    }
    public void meow() {
        System.out.println(getName() + " is meowing");
    }


}