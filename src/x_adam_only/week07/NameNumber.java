package x_adam_only.week07;

public class NameNumber {

    public static void main(String[] args) {

        String names = "Adam Adam Barry Aysun Aysun";

        String result = "";
        String temp = "";


        for (int i = 0; i < names.length(); i++) {
            // in order to find the name
            if (names.charAt(i) != ' ') {
                temp += names.charAt(i);
                continue;
            }


            // in order to count word
            String search = temp;
            int counter = 0;

            String dumy = names;
            while (dumy.contains(search)) {
                counter++;
                dumy = dumy.replaceFirst(search, "");
            }
            if (!result.contains(search)) {
                result += search + "-" + counter + " ";
            }
            temp = "";
        }

        System.out.println(result);
    }

}
/*
Task 3: Count each name in sentence.

    input :

  String names = "Adam Adam Barry Aysun Aysun";

    output:

    Adam-2 Barry-1 Aysun-2
 */

