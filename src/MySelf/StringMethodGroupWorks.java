package MySelf;

public class StringMethodGroupWorks {

    public static void main(String[] args) {

        String word = "Gorkem";
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            if (i%2==0) {
                result+= word.substring(i,i+1).toLowerCase();
            } else {
                result+= word.substring(i,i+1).toUpperCase();
            }
        }

        System.out.println(result);
    }


}
