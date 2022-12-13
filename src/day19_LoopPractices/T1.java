package Day19_LoopPractices;

public class T1 {

    public static void main(String[] args) {

        String str = "aabcccd";
        String result = "";


        while (!(str.isEmpty())){
            char ch = str.charAt(0);
            int freq = 0;
            for (int j = 0; j < str.length(); j++) {
                char chX = str.charAt(j);
                if (ch==chX) freq++;
            }
            result+=ch+""+freq;
            str=str.replaceAll((ch+""),"");
        }
        System.out.println(result);
    }

}
