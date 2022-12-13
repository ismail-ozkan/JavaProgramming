package day15_ForLoop;

public class Alphabet {

    public static void main(String[] args) {

        // A ~ Z  (65-90)

        for (char i = 'A'; i <='Z'; i++) {
            System.out.print(i+" ");
        }
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z

        System.out.println();
        System.out.println("----------------------------");

        // A ~ Z

        for (int i = 65; i <= 90; i++) {
            System.out.print((char)i+" ");
        }
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
        System.out.println();
        System.out.println("----------------------------");

        // a ~ z

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i+" ");
        }
//a b c d e f g h i j k l m n o p q r s t u v w x y z
        System.out.println();
        System.out.println("----------------------------");

        // Z ~ A

        for (int i = 90; i >= 65; i--) {
            System.out.print((char)i+" ");
        }
//Z Y X W V U T S R Q P O N M L K J I H G F E D C B A

        System.out.println();
        System.out.println("---------------------------------------");

        for (char i = 'Z'; i >= 'A'; i-- ) {
            System.out.print(i+" ");
        }

//Z Y X W V U T S R Q P O N M L K J I H G F E D C B A

        System.out.println();
        System.out.println("---------------------------------------");



        for (char i = 1; i <= 20000; i++) {
            System.out.print(i +" ");
        }


    }

}
