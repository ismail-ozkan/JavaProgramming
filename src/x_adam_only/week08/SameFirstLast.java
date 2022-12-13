package x_adam_only.week08;

public class SameFirstLast {

    public static void main(String[] args) {

        String[] list = {"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"};
        int counter = 0;
        for (String name : list) {
            name = name.toLowerCase();
            if (name.charAt(0)==name.charAt(name.length()-1)) {
                counter++;
            }
        }
        System.out.println("counter = " + counter);
    }

}
/*
Task 3 : Write a program that accepts String array.Count how many names have the same first and last letter

				Input : "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"

				Output : 4
 */



