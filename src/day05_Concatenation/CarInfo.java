package day05_Concatenation;

public class CarInfo {

    public static void main(String[] args) {

        String year = "2013",
                make = "Peugeout",
                model = "301",
                color = "Grey";
        int miles = 200_000,
                price = 10_000;


        String carInfo = year + " " + make + " " + model + ", " + miles + " miles, " + color + ", $" + price + ".";

        System.out.println(carInfo);
    }

}
