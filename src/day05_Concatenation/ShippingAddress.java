package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {
/*
        String name = "Jimmy Joe";
        String buildingNumber = "7925";
        String streetName = "Jones Branch Dr";
        String city = "McLean";
        String state = "VA";
        String zipCode = "20125";

        instead of above usage, we can use below usage for same data type of variables
        but it is important that we use "," (comma) instead of ";"(semicolon) and finish using is ";" !!!
*/
        String name = "Jimmy Joe",
                buildingNumber = "792B5A",
                streetName = "Jones Branch Dr",
                city = "McLean",
                state = "VA",
                zipCode = "20125";
        // System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode);

        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode;
        System.out.println(address);

        String nameMy = "İsmail Özkan",
                buildingNumberMy = "No8BoraApt4",
                streetNameMy = "2348SK",
                cityMy = "Kocaeli",
                stateMy = "Turkey",
                zipCodeMy = "41014",
                addressMy = nameMy + "\n" +
                        buildingNumberMy + " " + streetNameMy + "\n" +
                        cityMy + ", " + stateMy + " " + zipCodeMy;

        System.out.println(addressMy);
    }

}


/*
Declare the following variables:
    name
    buildingNumber
    streetName
    city
    state
    zipCode
Use concatenation to print the full shipping address
    EX:
		Jimmy Joe
		79B25A Jones Branch Dr
		McLean, VA 20125
 */
