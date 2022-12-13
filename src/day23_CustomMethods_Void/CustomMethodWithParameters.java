package day23_CustomMethods_Void;

public class CustomMethodWithParameters {

    public static void main(String[] args) {

        oddOrEven(2);
        ageOfPerson(1991);

        fromXtoY(2,10);


    }

    // create a function that can check if a number is odd number or even number
    public static void oddOrEven(int number){
        if (number%2==0) {
            System.out.println(number + " is even number");
        } else{
            System.out.println(number + " is odd number");
        }
    }

    // create a function that can display the age of person
    public static void ageOfPerson(int birthYear) {


        int age = 2022-birthYear;
        System.out.println("Your age is: "+age);


    }

    public static void fromXtoY(int x, int y){

        for (int i = x; i < y; i++) {
            System.out.print(i+" ");
        }

    }

}
