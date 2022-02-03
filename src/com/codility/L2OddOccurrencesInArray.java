package com.codility;

import java.util.Arrays;

public class L2OddOccurrencesInArray {
    public static void main(String[] args) {
        // write your code here
        int[] A = {1, 7, 7, 9};

        int i = SolutionL2B.solution(A);
        System.out.println(i);
    }
}
class SolutionL2B {

    public static int solution(int[] A) {
        // write your code in Java SE 8

        if (A.length == 1) {
            return A[0];
        }
        Arrays.parallelSort(A);
        for(int i=0; i<A.length-2; i+=2) {
            if(A[i]!=A[i+1])
                return A[i];
        }
        return A[A.length-1];
    }
//    public static int solution(int[] A) {
//        int result = 0;
//        for (int x : A) result = result ^ x;
//        return result;
//    }

//    public static int solution (int[] x) {
//        int found = 0;
//        int i = 0;
//        int j = 1;
//
//        Arrays.sort(x);
//        //To sort the array so if you have {9 , 3 , 9 , 3 , 9 , 7 , 9}
//        //it will be { 3 , 3 , 7 , 9 , 9 , 9 , 9}
//        if (x.length == 1) {
//            found = x[0];
//        }
//
//        while (x.length % 2 == 1 && i < x.length && j < x.length) {
//            if (x[i] == x[i+1]) {
//                i = i + 2;
//                j = j + 2;
//            } else {
//                found = x[i];
//                break;
//            }
//        }
//
//        if (found == 0 && i == x.length-1) {
//            found = x[i];
//        }
//
//        return found;
//    }



}
