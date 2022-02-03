package com.codility;

public class L3cTapeEquilibrium {
    public static void main(String[] args) {
        // write your code here
        int[] A = {3,1,2,4,3};
        int k = SolutionL3c.solution(A);
        System.out.println(k);
    }
}
class SolutionL3c {
    public static int solution(int[] A) {

        // write your code in Java 11
        int length = A.length;

        int sum1 = A[0];
        int sum2 = 0;
        int P = 1;
        for (int i = P; i < length; i++) {
            sum2 += A[i];
        }
        int diff = Math.abs(sum1 - sum2);

        for (; P < length - 1; P++) {
            sum1 += A[P];
            sum2 -= A[P];

            int newDiff = Math.abs(sum1 - sum2);
            if (newDiff < diff) {
                diff = newDiff;
            }
        }
        return diff;
    }
}