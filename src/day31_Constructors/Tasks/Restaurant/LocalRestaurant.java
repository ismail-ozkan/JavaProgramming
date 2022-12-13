package day31_Constructors.Tasks.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant myRestaurant = new Restaurant("İsmail Özkan","Gebze",5);

        Server server1 = new Server("ali",145,10,false);
        Server server2 = new Server("aliş",165,25,true);
        Server server3 = new Server("veli",147,22,true);
        ArrayList<Server> myServers = new ArrayList<>(Arrays.asList(server2, server3));
        Chef chef1 = new Chef("gökhan",186,40,true);
        Chef chef2 = new Chef("hakan",126,45,true);
        Chef chef3 = new Chef("turhan",321,42,false);
        ArrayList<Chef> myChefs = new ArrayList<>(Arrays.asList(chef2,chef3));

        myRestaurant.hireServer(server1);
        myRestaurant.Servers.addAll(myServers);
        myRestaurant.Chefs.add(chef1);
        myRestaurant.Chefs.addAll(myChefs);

        System.out.println(myRestaurant);
        myRestaurant.terminateChef(321);
        System.out.println("-------------------------------");
        System.out.println(myRestaurant);

        chef2.washDishes();
        server2.cleanTable();
        System.out.println(myRestaurant.Chefs);


    }

}
