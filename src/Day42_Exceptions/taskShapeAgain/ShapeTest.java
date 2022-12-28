package Day42_Exceptions.taskShapeAgain;

public class ShapeTest {

    public static void main(String[] args) {

        try {
            System.out.println(" Creating Shape object started");
            Shape shape1 = new Shape("");
            System.out.println(" Creating Shape object completed");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println(" Creating Shape object started");
            Shape shape2 = new Shape("shape 1");
            System.out.println(" Creating Shape object is completed with using "+shape2.getName()+" as a name");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println(" Creating Square object started");
            Square square1 = new Square(-1.2);
            System.out.println(" Creating Square object completed");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println(" Creating Square object started");
            Square square2 = new Square(2);
            System.out.println(" Creating Square with size that is "+square2.getSide()+" object completed. And area of Square is: "+square2.area());
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
