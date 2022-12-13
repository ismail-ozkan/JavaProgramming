package day35_Encapsulation.Tasks.restaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        ArrayList<Server> servers = new ArrayList<>();
        Server server1 = new Server("Hali",145,10,false);
        Server server2 = new Server("Dany",165,25,true);
        Server server3 = new Server("Reli",147,22,true);
        servers.addAll(Arrays.asList(server2,server3));

        Chef chef1 = new Chef("Shan",186,40,true);
        Chef chef2 = new Chef("Gyban",126,45,true);
        Chef chef3 = new Chef("Arbhan",321,42,false);
        ArrayList<Chef> myChefs = new ArrayList<>(Arrays.asList(chef2,chef3));

        Restaurant restaurant1 = new Restaurant("Mike","Serybze", servers,myChefs,5);

        restaurant1.hireServer(server1);
        restaurant1.hireServer(servers);
        System.out.println(restaurant1);

    }

}
