package com.codility;
import java.util.Stack;
public class L7aBrackets {
    public static void main(String[] args) {
        String A = "{[()()]}";
//          String A =  "[{()()]}";
        int i = SolutionL7a.solution(A);
        System.out.println ((i));
    }

}

class SolutionL7a {
    public static int solution(String S) {
        Stack<Character> T = new Stack<Character>();
        int n = S.length();
        for (int i = 0; i < n; i++) {
            char s = S.charAt(i);
            if (s == '(' || s == '[' || s == '{') {
                T.push(s);
            } else {
                if (
                        T.size() == 0
                                || (s == ')' && T.peek() != '(')
                                || (s == ']' && T.peek() != '[')
                                || (s == '}' && T.peek() != '{')
                ) {
                    return 0;
                }
                T.pop();
            }
        }
        return T.size() == 0 ? 1 : 0;
    }
}
