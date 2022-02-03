package com.codility;
import java.util.Arrays;
/** https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/ */
public class L2CyclicRotation { public static void main(String[] args) {
    // write your code here
    int[] A ={3, 4, 9,10};
    int K= 3;
    int [] i = SolutionL2A.solution(A, K);
    System.out.println (Arrays.toString(i));
    }
}
class SolutionL2A {
    public static int[] solution(int[] A, int K) {
        // write your code in Java SE 11
        int[] newArr = new int[A.length];

        if (A.length == 0) return A; // 1st cond.
        K = K%A.length;// avoiding unnecessary complete rotation
        for (int i=0; i<A.length; i++) {

            newArr[i] = A[(i + (A.length - K)) % (A.length)];

        }

        return newArr;
    }
}
