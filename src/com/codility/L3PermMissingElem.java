package com.codility;

import java.util.Arrays;

public class L3PermMissingElem {
    public static void main(String[] args) {
        // write your code here
        int[] A = {1,2,3,4,6};

        int k = SolutionL3c.solution(A);
        System.out.println(k);
    }
}
class SolutionL3b {
    public static int solution(int[] A) {
        int missing = 1; // missing number 1 already
        Arrays.sort(A);

        // check numbers one by one
        for (int i = 0; i < A.length; i++) {
            if (A[i] == missing) {    // we found the missing number !
                missing = A[i]+1;    // add +1 and keep checking
            }
        }
        return missing;
    }

//    public static int solution(int[] A) {
//        int r = 0;
//        if (A.length == 0) return 1;
//        if (A.length == 1) return A[0];
//
//        Arrays.parallelSort(A);
//        for (int i = 0; i < A.length; i++) {
//            if (A[i] + 1 == A[i + 1])
//                continue;
//            else return A[i + 1] -1;
//        }
//        return r;
//    }



}