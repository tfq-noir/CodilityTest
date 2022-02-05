package com.codility;
import java.util.Arrays;
import java.lang.Math;

public class L6bMaxProductOfThree {
    public static void main(String[] args) {
        // write your code here
       int[] A = {-3,1,2,-2,5,6};
        // int[] A = {-5, -6, -4, -7, -10};

        int i = SolutionL6b.solution(A);
        System.out.println ((i));
    }
}
class SolutionL6b {
    public static int solution(int[] A) {
        Arrays.sort(A);
        int n = A.length;
        return Math.max(
                A[0] * A[1] * A[n - 1],
                A[n - 3] * A[n - 2] * A[n - 1]
        );
    }
}