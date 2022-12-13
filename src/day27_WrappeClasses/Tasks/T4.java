package day27_WrappeClasses.Tasks;

public class T4 {

    public static void main(String[] args) {

        String str = "JAVA java";
        equalLowerUpper(str);

    }

    public static void equalLowerUpper(String str) {

        char[] chars = str.toCharArray();
        int lowerCounter = 0;
        int upperCounter = 0;
        for (char each : chars) {
            if (Character.isUpperCase(each)) upperCounter++;
            else if (Character.isLowerCase(each)) lowerCounter++;
        }
        System.out.println(upperCounter == lowerCounter);
    }

}
/*
4. Write program that returns true if the total number of upper case characters are equal to
 total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true

 */