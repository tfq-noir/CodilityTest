/**A non-empty array A consisting of N integers is given.

 A permutation is a sequence containing each element from 1 to N once, and only once.

 For example, array A such that:

 A[0] = 4
 A[1] = 1
 A[2] = 3
 A[3] = 2
 is a permutation, but array A such that:

 A[0] = 4
 A[1] = 1
 A[2] = 3
 is not a permutation, because value 2 is missing.

 The goal is to check whether array A is a permutation.

 Write a function:

 class Solution { public int solution(int[] A); }

 that, given an array A, returns 1 if array A is a permutation and 0 if it is not.

 For example, given array A such that:

 A[0] = 4
 A[1] = 1
 A[2] = 3
 A[3] = 2
 the function should return 1.

 Given array A such that:

 A[0] = 4
 A[1] = 1
 A[2] = 3
 the function should return 0.
 */
package com.codility;
import java.util.Arrays;

public class L4bPermCheck {
    public static void main(String[] args) {
        // write your code here
        int[] A = {};
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