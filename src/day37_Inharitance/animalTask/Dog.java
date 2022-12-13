package day37_Inharitance.animalTask;

public class Dog extends Animal{//Dog is an animal

    //public int a;

    public Dog(String name, String breed, char gender, int age, String size, String color/*, int a*/){
        super(name, breed, gender, age, size, color);
        //this.a = a;
    }

    public void bark(){
        System.out.println(name + " is barking");
    }

}
