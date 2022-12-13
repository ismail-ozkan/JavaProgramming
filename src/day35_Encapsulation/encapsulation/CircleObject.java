package day35_Encapsulation.encapsulation;

public class CircleObject {

    public static void main(String[] args) {


        Circle c1 = new Circle(5.5);

        System.out.println(c1);

        Circle c2 = c1;

//---------RELATED OTHER TOPİC---------------------------------------------
        c2.setRadius(3.5);
        System.out.println(c1);//Circle{radius=3.5,...
        System.out.println(c2);//Circle{radius=3.5,...
    }

}
