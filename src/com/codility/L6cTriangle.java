package com.codility;
import java.util.Arrays;

public class L6cTriangle {
    public static void main(String[] args) {
        // write your code here
//        int[] A = {10,2,5,1,8,20};
         int[] A = {10, 50, 5, 1};

        int i = SolutionL6c.solution(A);
        System.out.println ((i));
    }
}
class SolutionL6c {
    public static int solution(int[] A) {
        int n = A.length;
        if (n < 3) {
            return 0;
        }
        Arrays.sort(A);
        for (int i = 0; i < n-2 ; i++) { // n-2 for avoiding ArrayIndexOutOfBoundsException
            if ((long)A[i] + A[i + 1] > A[i + 2]) {
                return 1;
            }
        }
        return 0;
    }
}
