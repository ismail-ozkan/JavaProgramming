package MySelf.hacerRank;

import java.util.Stack;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // create a scanner to read input
        Scanner scanner = new Scanner(System.in);

        // read input lines one by one until we reach the end of the file
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            // check if the string is balanced and print the result
            System.out.println(isBalanced(line));
        }
    }

    public static boolean isBalanced(String s) {
        // create a stack to store the opening parentheses
        Stack<Character> stack = new Stack<>();

        // go through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // if the character is an opening parenthesis, push it to the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                // if the character is a closing parenthesis and the stack is empty,
                // the string is not balanced
                if (stack.isEmpty()) {
                    return false;
                }

                // if the character is a closing parenthesis, pop the top element from
                // the stack and check if it matches the closing parenthesis
                char top = stack.pop();
                if (c == ')' && top != '(' || c == '}' && top != '{' || c == ']' && top != '[') {
                    return false;
                }
            }
        }

        // if the stack is not empty, the string is not balanced
        if (!stack.isEmpty()) {
            return false;
        }

        // if we reach this point, the string is balanced
        return true;
    }
}