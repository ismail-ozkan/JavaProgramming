package day21_ForEachLoop;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};

        for (String element : words) {
            int freq = 0;
            for (String each : words) {
                if (each.equals(element)) freq++;
            }
            if (freq==1) System.out.println(element);
        }



    }

}
