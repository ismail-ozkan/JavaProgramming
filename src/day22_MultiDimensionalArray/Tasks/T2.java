package day22_MultiDimensionalArray.Tasks;

public class T2 {
/*
2. Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado
 */
    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        for (String[] item : items) {
            for (String result : item) {
                System.out.print(result+"\t");
            }
            System.out.println();
        }
        System.out.println("\n--------------------------------------------");

        for (String[] item : items) {
            for (int i = item.length - 1; i >= 0; i--) {
                System.out.print(item[i]+"\t");
            }
            System.out.println();
        }
        System.out.println("\n--------------------------------------------");

        for (int i = items.length - 1; i >= 0; i--) {
            for (int j = items[i].length-1; j >= 0; j--) {
                System.out.print(items[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("\n--------------------------------------------");

        for (int i = items.length - 1; i >= 0; i--) {
            for (String result : items[i]) {
                System.out.print(result+"\t");
            }
            System.out.println();
        }

    }

}
