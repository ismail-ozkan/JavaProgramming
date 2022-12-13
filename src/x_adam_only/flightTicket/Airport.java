package x_adam_only.flightTicket;

import java.util.ArrayList;
import java.util.Arrays;

public class Airport {

    static ArrayList<FlightTicket> list = new ArrayList<>();

    static {
        FlightTicket flightTicket1 = new FlightTicket("first", "Washington", "Virgina");
        FlightTicket flightTicket2 = new FlightTicket("business", "New York", "Texas");
        FlightTicket flightTicket3 = new FlightTicket("economy", "Chicago", "Vegas");
        FlightTicket flightTicket4 = new FlightTicket("first", "Chicago", "San Francisco");
        FlightTicket flightTicket5 = new FlightTicket("business", "Virgina", "Washington");
        FlightTicket flightTicket6 = new FlightTicket("economy", "Chicago", "New York");
        FlightTicket flightTicket7 = new FlightTicket("first", "Chicago", "Boston");
        FlightTicket flightTicket8 = new FlightTicket("business", "San Francisco", "Texas");
        FlightTicket flightTicket9 = new FlightTicket("economy", "Chicago", "Washington");
        FlightTicket flightTicket10 = new FlightTicket("economy", "Vegas", "Virgina");

        list.addAll(Arrays.asList(flightTicket10, flightTicket1, flightTicket2, flightTicket3, flightTicket4, flightTicket5, flightTicket6, flightTicket7, flightTicket8, flightTicket9));
    }

    public ArrayList<FlightTicket> whichType(String type) {
        ArrayList<FlightTicket> result = new ArrayList<>();
        for (FlightTicket flightTicket : list) {
            if (flightTicket.equals(type)) {
                result.add(flightTicket);
            }
        }
        return result;
    }

    public ArrayList<FlightTicket> fromWhere(String place) {
        ArrayList<FlightTicket> result = new ArrayList<>();
        for (FlightTicket ticket : list) {
            if (ticket.getDeparture().equalsIgnoreCase(place)) {
                result.add(ticket);
            }
        }

        return result;
    }


    public static void main(String[] args) {

        Airport airport = new Airport();

        System.out.println(airport.fromWhere("Chicago"));

    }

}
