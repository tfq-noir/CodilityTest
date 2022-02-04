package com.codility;

import java.util.Arrays;

public class L4bPermCheck {
    public static void main(String[] args) {
        // write your code here
        int[] A = {4,5,3,2};
        // (4,1,3,2) = 1
        // (4,1,3) = 0
        // (1) = 1
        // () = 1
        // (2) = 0
        int k = SolutionL4b.solution(A);
        System.out.println(k);
    }
}

class SolutionL4b {

    public static int solution(int[] A) {

        Arrays.sort(A);
        int n = A.length;
        for (int i = 1; i <= n; i++) {
            if (A[i - 1] != i) {
                return 0;
            }
        }
        return 1;


//        Set<Integer> intSet = new HashSet<>();
//
//        for (int i = 0; i < A.length; i++) {
//            intSet.add(A[i]);
//        }
//
//        for (int i = 0; i < A.length; i++) {
//            if(!intSet.contains(i + 1)) {
//                return 0;
//            }
//        }
//        return 1;


//        int[] mark = new int[A.length + 1];
//
//        for (int i = 0; i < A.length; i++) {
//            int value = A[i];
//            if(value >= mark.length) {
//                return NOT_PERMUTATION;
//            }
//            if(mark[value] == 0) {
//                mark[value]=1;
//            } else {
//                return NOT_PERMUTATION;
//            }
//        }
//        return PERMUTATION;
    }

}