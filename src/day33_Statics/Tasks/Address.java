package day33_Statics.Tasks;

public class Address {

    public String street;
    public String city;
    public String state;
    public String zipCode;
    public static String country = "USA";
    public static String planet = "Earth";

    public Address(String street, String city, String state, String zipCode) {
        this.city = city;
        this.street = street;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return "Address{\n" +
                street+" "+city+"\n" +
                state +", " + zipCode + "\n" +
                '}';
    }
}
/*
5. Address Task:
		1. Create a class named Address:

		    Attributes:
		        instance:  street, city, state, zipCode;
		        static: country, planet

	        Add a constructor that can set All the fields (instances)

		    Actions
		            setInfo: sets all the instances
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012
 */