package day37_Inharitance.animalTask;

public class Cat extends Animal {
    // if the Super Class non-default constructor
    // calling Super Class Constructor explicitly is mandatory
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void scratch(){
        System.out.println(name + " is scratching");
    }


}
