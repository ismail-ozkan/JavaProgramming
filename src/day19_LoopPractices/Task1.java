package Day19_LoopPractices;

public class Task1 {

    public static void main(String[] args) {

        String str = "abbccdeff";
        String dup = "";

        for (int i = 1; i < str.length()+1; i++) {
            String ch = str.charAt(i-1)+"";
            for (int j = 0; j < str.length(); j++) {
                if (str.substring(i).startsWith(ch)) {
                    dup+=""+ch;
                    System.out.println(dup);
                    System.exit(0);
                }
            }
        }




    }

}
