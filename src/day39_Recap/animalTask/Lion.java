package day39_Recap.animalTask;

public class Lion extends WildAnimal{

    public Lion(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " is hunting bison");
    }
    public void roar(){
        System.out.println(getName() + " is roaring");
    }
}
