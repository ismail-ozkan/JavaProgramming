package day24_CustomMethod_Return.Tasks;

public class T1 {

    public static void main(String[] args) {

        String text = "Java java java python python";
        String word = "java";

        int result = frequencyOfWord(text,word);
        System.out.println(result);
    }

    public static int frequencyOfWord(String sentence, String word) {

        int frequency = 0;
        word = word.toLowerCase();
        String[] arr = sentence.toLowerCase().split(" ");
        for (String each : arr) {
            if (word.equals(each)){
                frequency++;
            }
        }

        return frequency;
    }

}
/*
1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word,
then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */