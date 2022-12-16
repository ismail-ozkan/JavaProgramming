package day39_Recap.animalTask;

public class Tiger extends WildAnimal{

    public Tiger(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }
    public void hunt() {
        System.out.println(getName() + " is hunting buffalo");
    }
    public void hide(){
        System.out.println(getName() + " is hiding");
    }

}
