package com.codility;

import java.util.*;

public class L7cNesting {
    public static void main(String[] args) {
        String A = "(()(())())";
//          String A =  "[{()()]}";
        int i = SolutionL7c.solution(A);
        System.out.println ((i));
    }

}
class SolutionL7c {
    public static int solution(String S) {

        // special case 1: empty string
        if( S.length() ==0)
            return 1;
            // special case 2: odd length
        else if( S.length() % 2 == 1)
            return 0;

        // main idea: use "stack" to check
        Stack<Character> st = new Stack<>();

        for(int i=0; i<S.length(); i++){

            if( S.charAt(i)=='(' ){
                st.push(')'); // note: push its pair (be careful)
            }
            else if(S.charAt(i)==')'){

                // before pop: need to check if stack is empty (important)
                if(st.isEmpty() == true){
                    return 0;
                }
                else{
                    char temp = st.pop();
                    if( temp != ')'){
                        return 0;
                    }
                }
            }
        }

        // be careful: if stack is "not empty" -> return 0
        if( !st.isEmpty() )
            return 0;
        else
            return 1;
    }
}