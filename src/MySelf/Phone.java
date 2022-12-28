package MySelf;

public class Phone {
    static int pieceOfCake = 10;

    private void eatCake(int piece) {
        pieceOfCake-=piece;
    }

    public static void main(String[] args) {

        new Phone().eatCake(2); // first object
        System.out.println(Phone.pieceOfCake);// 8
        new Phone().eatCake(2);// new other object
        System.out.println(Phone.pieceOfCake);// 6

    }



}