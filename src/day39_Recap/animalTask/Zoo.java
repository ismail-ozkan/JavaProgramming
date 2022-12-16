package day39_Recap.animalTask;
public class Zoo {

    public static void main(String[] args) {

        Cat cat = new Cat("Moly","Van","Small","White",2,'F');

        cat.eat();
        cat.meow();

        Dog dog=new Dog("Coni","German","Small","black",5,'F');

        dog.bark();
        dog.sleep();

        Tiger tiger = new Tiger("frenk","African","Middle","Orange-Black",4,'M');

        tiger.hide();
        tiger.hunt();

        Eagle eagle=new Eagle("Kartal","Mountain","medium","white",7 ,'F');
        eagle.hunt();
        eagle.drink();




    }

}
