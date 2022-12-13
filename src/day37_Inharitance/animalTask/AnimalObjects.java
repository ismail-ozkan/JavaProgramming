package day37_Inharitance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Alex", "Husky", 'M',1,"Small","White");

        System.out.println(dog1);
        dog1.bark();
    //   dog1.sing();

        Cat cat1 = new Cat("Love","Siamese",'F',2,"Large","White");

        System.out.println(cat1);
        cat1.scratch();
     //   cat1.bark();
     //   cat1.sing();



        Parrot parrot1 = new Parrot("King", "Macav", 'M',3,"Small", "Blue");

        System.out.println(parrot1);
        parrot1.sing();
        //parrot1.bark();



    }
}
