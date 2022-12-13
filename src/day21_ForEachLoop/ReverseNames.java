package day21_ForEachLoop;

public class ReverseNames {

    public static void main(String[] args) {

        String[] names = {"Elminur Ablimit", "Taha Kerem Özkan", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};


        for (String name : names) {
            //char[] ch = name.toCharArray();
            String reverseName ="";
            for (int i=name.length()-1; i>=0; i--) {
                //reverseName+=ch[i];
                reverseName+=name.charAt(i);
            }
            System.out.println(reverseName);
        }

    }

}
