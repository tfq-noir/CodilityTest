/**
 * You are given N counters, initially set to 0, and you have two possible operations on them:
 *
 * increase(X) − counter X is increased by 1,
 * max counter − all counters are set to the maximum value of any counter.
 * A non-empty array A of M integers is given. This array represents consecutive operations:
 *
 * if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
 * if A[K] = N + 1 then operation K is max counter.
 * For example, given integer N = 5 and array A such that:
 *
 *     A[0] = 3
 *     A[1] = 4
 *     A[2] = 4
 *     A[3] = 6
 *     A[4] = 1
 *     A[5] = 4
 *     A[6] = 4
 * the values of the counters after each consecutive operation will be:
 *
 *     (0, 0, 1, 0, 0)
 *     (0, 0, 1, 1, 0)
 *     (0, 0, 1, 2, 0)
 *     (2, 2, 2, 2, 2)
 *     (3, 2, 2, 2, 2)
 *     (3, 2, 2, 3, 2)
 *     (3, 2, 2, 4, 2)
 */
package com.codility;
import java.util.Arrays;
public class L4cMaxCounters {
    public static void main(String[] args) {
        int[] A ={3,4,4,6,1,4,4};
        int N= 5;
        int [] i = SolutionL4c.solution(N, A);
        System.out.println (Arrays.toString(i));
    }
}

class SolutionL4c {
    public static int[] solution(int N, int[] A) {
            int maxValue = 0;
            int minValue = 0;
            int[] NewCounters = new int[N];

            for(int i=0; i<A.length; i++) {
                int indexPosition = A[i];
                if(indexPosition == N+1) {

                    // Max value operation
                    minValue = maxValue;

                } else {

                    // Increment operation
                    indexPosition--;// -1 to find the exact position in array
                    NewCounters[indexPosition] = Math.max(NewCounters[indexPosition]+1, minValue+1);
                    maxValue = Math.max(maxValue, NewCounters[indexPosition]);
                }
            }
//adding current minimum value to the empty index
// method 1
            for(int i=0; i<NewCounters.length; i++) {
                NewCounters[i] = Math.max(NewCounters[i], minValue);
            }
//  method 2
//            for(int i=0; i<NewCounters.length; i++) {
//                if (NewCounters[i] < minValue)
//                    NewCounters[i] = minValue;
//        }
            return NewCounters;
        }
}