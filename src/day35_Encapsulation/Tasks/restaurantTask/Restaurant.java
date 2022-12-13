package day35_Encapsulation.Tasks.restaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    private String Owner, Location;
    private ArrayList<Server> Servers = new ArrayList<>();
    private ArrayList<Chef> Chefs = new ArrayList<>();
    private int numberOfStars;

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        this.Owner = owner;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        this.Location = location;
    }

    public ArrayList<Server> getServers() {
        return Servers;
    }

    public void setServers(ArrayList<Server> servers) {
        this.Servers = servers;
    }

    public ArrayList<Chef> getChefs() {
        return Chefs;
    }

    public void setChefs(ArrayList<Chef> chefs) {
        this.Chefs = chefs;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public Restaurant(String owner, String location, ArrayList<Server> servers, ArrayList<Chef> chefs, int numberOfStars) {
        setOwner(owner);
        setLocation(location);
        setServers(servers);
        setChefs(chefs);
        setNumberOfStars(numberOfStars);
    }

    public void hireServer(Server server){
        Servers.add(server);
    }
    public void hireServer(Server[] servers) {
        Servers.addAll(Arrays.asList(servers));
    }
    public void hireServer(ArrayList<Server> servers){
        Servers.addAll(servers);
    }
    public void terminateChef(int emplooyeID) {
        Chefs.removeIf(p -> p.getEmployeeID()==emplooyeID);
    }
    public void terminateServer(int employeeID){
        Servers.removeIf(p -> p.getEmployeeID()==employeeID);
    }

    public String toString() {
        return "Restaurant{" +
                "Owner='" + Owner + '\'' +
                ", Location='" + Location + '\'' +
                ", Servers=" + Servers +
                ", Chefs=" + Chefs +
                ", numberOfStars=" + numberOfStars +
                ", numberOfChefs=" + Chefs.size() +
                ", numberOfServers=" + Servers.size() +
                '}';
    }
}
