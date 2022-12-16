package day39_Recap.animalTask;

public class Crocodile extends WildAnimal {

    public Crocodile(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    public void hunt() {
        System.out.println("Crocodile " + getName() + " hunts reptiles");
    }
}