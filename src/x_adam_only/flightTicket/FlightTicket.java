package x_adam_only.flightTicket;

public class FlightTicket {

    private String type, departure, arrival;

    public FlightTicket(String type, String departure, String arrival) {
        setType(type);
        setDeparture(departure);
        setArrival(arrival);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (!(type.equalsIgnoreCase("first")||type.equalsIgnoreCase("business")||type.equalsIgnoreCase("economy"))){
            return;
        } else {
            this.type = type;
        }
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String toString() {
        return "FlightTicket{" +
                "type='" + type + '\'' +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }
}
