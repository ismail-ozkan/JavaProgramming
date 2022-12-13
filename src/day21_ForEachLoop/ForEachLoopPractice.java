package day21_ForEachLoop;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        String[] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};

        for ( String each : words) {
            String result = "";
            result+=each.charAt(0);
            result+=each.charAt(each.length()-1);
            System.out.println(result);
        }

        System.out.println("------------------------------");


        for (String word : words) {
            String res = "";
            res+=""+word.charAt(0)+word.charAt(word.length()-1);
            System.out.println(res);
        }

    }

}
