package day35_Encapsulation.Tasks.pizza;

public class PizzaObject {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("small",2,3);
        Pizza pizza2 = new Pizza("small",4,6);
        Pizza pizza3 = new Pizza("small",3,5);
        Pizza pizza4 = new Pizza("small",4,3);
        Pizza pizza5 = new Pizza("medium",3,8);
        Pizza pizza6 = new Pizza("large",7,2);




        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza5);
        System.out.println(pizza6);

    }

}
