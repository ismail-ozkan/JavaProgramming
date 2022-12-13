package day38_Inheritance.tasks.animalTask;

public class Cat extends Animal{

    public Cat(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }
    public void eat(){
        System.out.println(name + " is eating food");
    }
}
