package day15_ForLoop.Tasks;

public class RetriveString {

    public static void main(String[] args) {


        String text = "ab112cd+%&efg546&/(";
        String letters = "",
                digits = "",
                specialChars = "";

        for (int i = 0; i<text.length(); i++) {

            if ((text.charAt(i)>='a'&&text.charAt(i)<='z')||(text.charAt(i)>='A'&&text.charAt(i)<='Z')){
                letters += text.charAt(i);
            } else if ((text.charAt(i)>='0'&&text.charAt(i)<='9')) {
                digits += text.charAt(i);
            } else {
                specialChars += text.charAt(i);
            }
        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("special chars = " + specialChars);


        for (int i = 0; i<specialChars.length(); i++) {
            for (int a = 0; a<specialChars.length(); a++) {
                if (specialChars.charAt(i)==specialChars.charAt(a)) {
                    specialChars = specialChars.replace((specialChars.charAt(i)+""),"");
                }
            }

        }

         System.out.println("specialChars = " + specialChars);

    }

}
