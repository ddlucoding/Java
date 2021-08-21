package BalancedExpressions;

import java.util.Stack;

public class BalancedOneBracket {
    public static void main(String[]args) {
        System.out.println(IsBalancedBrackets("[[]"));
    }
    public static boolean IsBalancedBrackets(String str) {
        var array = str.toCharArray();
        boolean balanced = true;
        Stack<Character> stack = new Stack<>();
        for (char character : array) {
            if (character == '[')
                stack.push(character);
            if (character == ']') {
                if (stack.isEmpty()) {
                    balanced = false;
                }
                else {
                    stack.pop();
                }

            }
        }
        if (!stack.isEmpty())
            balanced = false;
        return balanced;
    }
}
