package day20_Arrays;

public class AppaedredTwice {

    public static void main(String[] args) {

        char[] chars = {'A', 'A', 'A', 'A','B', 'C','C', 'D', 'D','D', 'E', 'E', 'E',};
        String twice = "";

        for (int i = 0; i < chars.length; i++) {
            char ch1 = chars[i];
            int freq = 0;
            for (int j = 0; j < chars.length; j++) {
                if (ch1==chars[j]){
                    freq++;
                }
            }
            if (freq==2){
                twice+=ch1;
            }
        }
        System.out.println("twice = " + twice);

    }

}
