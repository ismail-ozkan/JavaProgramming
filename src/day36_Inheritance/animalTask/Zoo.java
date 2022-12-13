package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky",'M', "Small",2,"White");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        //dog.hunt();
        //dog.scratch();
        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Tarcin","British",'M',"Small",3,"Brown");
        
        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();
        cat.meow();


        //cat.bark();
        System.out.println(cat);
        Tiger tiger = new Tiger();
        tiger.setInfo("Sher","Bengal",'M',"Large",4,"Red");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();
        tiger.hunt();

        //tiger.bark();
        //tiger.scratch();

        System.out.println(tiger);

    }

}
