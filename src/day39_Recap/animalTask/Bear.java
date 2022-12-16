package day39_Recap.animalTask;

public class Bear extends WildAnimal{
    public Bear(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }
    @Override
    public void hunt() {
        System.out.println("Bear "+getName()+" hunts fish");
    }
}
