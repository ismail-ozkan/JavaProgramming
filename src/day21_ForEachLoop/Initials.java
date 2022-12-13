package day21_ForEachLoop;

public class Initials {

    public static void main(String[] args) {

        String[] names = {"Elminur Ablimit", "Taha Kerem Özkan", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};


        for(String each : names) {
            String[] eachArr = each.split(" ");
            for (String s : eachArr) {
                System.out.print(s.charAt(0)+".");
            }
            System.out.println();
        }

    }

}
