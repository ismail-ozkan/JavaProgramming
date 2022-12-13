package day35_Encapsulation.Tasks.candy;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {

    public static void main(String[] args) {


        Candy candy1 = new Candy("Ulker",5,25,true);
        Candy candy2 = new Candy("Eti",5,0,true);
        Candy candy3 = new Candy("Tutku",5,5,false);
        Candy candy4 = new Candy("Milka",5,6,true);
        Candy candy5 = new Candy("Nutella",5,7,true);


        ArrayList<Candy> list = new ArrayList<>();
        list.addAll(Arrays.asList(candy1,candy2,candy3,candy4,candy5));

        for (Candy candy : list) {
            System.out.println(candy.getBrand() + " : " + candy.getPrice());
        }







    }


}
