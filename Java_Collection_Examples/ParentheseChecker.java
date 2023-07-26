package com.java.CollectionExamples;

import java.util.Stack;

public class ParentheseChecker {
    public static void main(String[] args) {
        String input = "((())((((()))()";

        String result = checkParen(input);
        System.out.println("Result: " + result);
    }

    public static String checkParen(String input) {
        Stack<Integer> stack = new Stack<>();


        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    input = input.substring(0, i) + input.substring(i + 1);
                    i--;
                }
              }
        }


        while (!stack.isEmpty()) {
            int index = stack.pop();
            input = input.substring(0, index) + input.substring(index + 1);
          }

        return input;
    }
}
