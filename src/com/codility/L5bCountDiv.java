package com.codility;

public class L5bCountDiv {
    public static void main(String[] args) {
        // write your code here
        int A = 6;
        int B = 11;
        int K = 2;
        int k = SolutionL5b.solution(A,B,K);
        System.out.println(k);
    }
}
class SolutionL5b {
    public static int solution(int A, int B, int K) {

        int b = (B/K) ;  // From 0 to B the integers divisible by K
        int a = (A/K) ;  // From 0 to A the integers divisible by K

        if (A%K == 0) { // "A" is inclusive; if divisible by K then
            --a;        //   remove 1 from "a"
        }
        return b-a;     // return integers in range
    }
}