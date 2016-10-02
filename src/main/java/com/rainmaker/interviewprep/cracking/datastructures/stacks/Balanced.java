package com.rainmaker.interviewprep.cracking.datastructures.stacks;

import java.util.Scanner;
import java.util.Stack;


public class Balanced {
    private static char leftBracket = '[';
    private static char leftParanthesis = '(';
    private static char leftBraces = '{';

    private static char rightBracket = ']';
    private static char rightParanthesis = ')';
    private static char rightBraces = '}';

    public static boolean isBalanced(String expression) {
        Stack<Character> leftStack = new Stack<Character>();
        char[] chars = expression.toCharArray();

        for (Character strChr: expression.toCharArray()) {

            if(strChr == leftBracket || strChr == leftParanthesis || strChr == leftBraces)
                leftStack.push(strChr);

            if(strChr == rightBraces) {
                if(leftStack.empty()) {
                    return false;
                } else if(leftStack.peek() == leftBraces) {
                    leftStack.pop();
                }
            }
            if(strChr == rightBracket) {
                if(leftStack.empty()) {
                    return false;
                } else if(leftStack.peek() == leftBracket) {
                    leftStack.pop();
                }
            }

            if(strChr == rightParanthesis) {
                if(leftStack.empty()) {
                    return false;
                } else if(leftStack.peek() == leftParanthesis) {
                    leftStack.pop();
                }
            }
        }

        return leftStack.empty();
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            boolean answer = isBalanced(expression);
            if(answer)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
