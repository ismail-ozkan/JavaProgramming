package MySelf;

public class FrequencyWithDelete {

    public static void main(String[] args) {

        String str = "Java Java Java Java Java Python";
        int frequency = 0;

        for (int i=0; i<=str.length()-4; i++) {
            if (str.substring(i).contains("Java")) {
                str = str.replaceFirst("Java","");
                frequency++;
            }
        }
        System.out.println(frequency);
        System.out.println(str.trim());

        // 2. SOLUTION with while loop

        String str1 = "Java Java Java Java Java Python";
        int freq = 0;

        while (str1.contains("Java")) {
            freq++;
            str1 = str1.replaceFirst("Java","");
        }

        System.out.println(freq);

        System.out.println("----------------------------------");

        String sentence = "cat cat cat cat dog dog cat cat";

        int countCat = 0;

        while (sentence.contains("cat")) {
            sentence = sentence.replaceFirst("cat", "");
            countCat++;
        }

        System.out.println("countCat = " + countCat);

    }

}
