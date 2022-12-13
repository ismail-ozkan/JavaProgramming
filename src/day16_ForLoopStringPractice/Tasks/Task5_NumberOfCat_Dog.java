package day16_ForLoopStringPractice.Tasks;

public class Task5_NumberOfCat_Dog {

    public static void main(String[] args) {

        String sentence = "caT dog dogG cAt";
        String cat = "cat";
        String dog = "dog";
        int numDog = 0;
        int numCat = 0;

        for (int i = 0; i < sentence.length()-2; i++) {
            if (sentence.toLowerCase().substring(i,i+3).equals(cat)) {
                numCat++;
            }
        }
        for (int i = 0; i < sentence.length()-2; i++) {
            if (sentence.toLowerCase().substring(i,i+3).equals(dog)) {
                numDog++;
            }
        }
        System.out.println((numCat==numDog)? true: false);
    }
}
/*
5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true

 */