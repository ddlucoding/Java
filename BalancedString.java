package BalancedExpressions;

import java.util.*;

public class BalancedString {
    public static void main(String[]args) {
        System.out.println(IsBalancedAll("3{4[{<a>c}{}165<4ae>hac{{{[<]>[]{{}}}}}]gdfe}"));
    }


    public static boolean IsBalancedAll(String str) {
        var array = str.toCharArray();
        boolean isBalanced = true;
        Stack<Character> stack = new Stack<>();
        for (char character : array) {
            if (character == '{' || character == '[' || character == '<' || character == '(')
                stack.push(character);
            else {
                if (character == '}') {
                    if (stack.isEmpty())
                        isBalanced = false;
                    if (stack.pop() == '{') {
                        continue;
                    } else {
                        isBalanced = false;
                        break;
                    }
                }
                if (character == ']') {
                    if (stack.isEmpty())
                        isBalanced = false;
                    if (stack.pop() == '[') {
                        continue;
                    } else {
                        isBalanced = false;
                        break;
                    }
                }
                if (character == ')') {
                    if (stack.isEmpty())
                        isBalanced = false;
                    if (stack.pop() == '(') {
                        continue;
                    } else {
                        isBalanced = false;
                        break;
                    }
                }
                if (character == '>') {
                    if (stack.isEmpty())
                        isBalanced = false;
                    if (stack.pop() == '<') {
                        continue;
                    } else {
                        isBalanced = false;
                        break;
                    }
                }
            }
        }
        if (!stack.isEmpty()) {
            isBalanced = false;
        }
        return isBalanced;
    }


}
