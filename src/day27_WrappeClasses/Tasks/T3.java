package day27_WrappeClasses.Tasks;

public class T3 {

    public static void main(String[] args) {

        String str = "Wooden Spoon123 !";
        retrieve(str);

    }

    public static void retrieve(String str) {

        char[] chars = str.toCharArray();
        String letters = "";
        String digits = "";
        String specialChars = "";
        for (char each : chars) {
            if (Character.isDigit(each)){
                digits+=each;
            } else if (Character.isLetter(each)) {
                letters+=each;
            } else {
                specialChars+=each;
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }
}
/*
3. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";
 */