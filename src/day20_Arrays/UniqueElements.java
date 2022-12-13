package day20_Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"Java", "Python" , "Java", "Python", "C#"};
        String uniqueElement = "";


        for (int i = 0; i < words.length; i++) {
            String element = words[i];
            int freq = 0;
            for (int j = 0; j < words.length; j++) {
                if (element.equals(words[j])){
                    freq++;
                }
            }
            if (freq==1) {
                uniqueElement+= words[i];
            }
        }

        System.out.println("uniqueElement = " + uniqueElement);
    }

}
