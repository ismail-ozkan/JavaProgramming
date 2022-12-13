package day23_CustomMethods_Void.Tasks;

public class T7 {

    //7. create a method that can calculate the area of a square

    public static void main(String[] args) {

        int side = 13;
        areaOfSquare(side);

    }


    public static void areaOfSquare(int side) {

        int area = side * side;
        System.out.println("Area of the square is: "+area);

    }


}
