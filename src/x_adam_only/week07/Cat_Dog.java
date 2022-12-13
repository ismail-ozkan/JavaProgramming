package x_adam_only.week07;

public class Cat_Dog {

    public static void main(String[] args) {

        String message = "I love cats! I have a cat named Coco. My cat's very smart!";
        String searched = "cat";
        String changed = "dog";
        if (message.contains(searched)) {
            for (int i = 0; i < message.length() - 2; i++) {
                int index = 0;
                if (message.substring(i).startsWith(searched)) {
                    index = i;
                    message = message.substring(0, i) + changed + message.substring(i + 3);
                }
            }
        } else {
            System.out.println(message);
        }
    }

}
/*
Task 2:  Write a program that replaces every occurrence of "cat" in the message with "dog", using indexOf and substring.

  input:

  String message = "I love cats! I have a cat named Coco. My cat's very smart!";

  output:

 "I love dogs! I have a dog named Coco. My dog's very smart!";
 */
