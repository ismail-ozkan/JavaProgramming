package day31_Constructors.Tasks.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    public String Owner, Location;
    public ArrayList<Server> Servers = new ArrayList<>();
    public ArrayList<Chef> Chefs = new ArrayList<>();
    public int numberOfStars;

    public Restaurant(String owner, String location, int numberOfStars) {
        this.Owner = owner;
        this.Location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer(Server server){
        Servers.add(server);
    }
    public void hireServer(Server[] servers) {
        Servers.addAll(Arrays.asList(servers));
    }
    public void terminateChef(int emplooyeID) {
        Chefs.removeIf(p -> p.employeeID==emplooyeID);
    }
    public void terminateServer(int employeeID){
        Servers.removeIf(p -> p.employeeID==employeeID);
    }


    public String toString() {
        return "Restaurant{" +
                "Owner='" + Owner + '\'' +
                ", Location='" + Location + '\'' +
                ", numberOfServers=" + Servers.size() +
                ", numberOfChefs=" + Chefs.size() +
                ", numberOfStars=" + numberOfStars +
                '}';
    }
}
