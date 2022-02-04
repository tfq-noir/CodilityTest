/**Write a function:

 class Solution { public int solution(int[] A); }

 that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

 For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

 Given A = [1, 2, 3], the function should return 4.

 Given A = [−1, −3], the function should return 1.
 */
package com.codility;
import java.util.Arrays;

public class L4dMissingInteger {
    public static void main(String[] args) {
        // write your code here
        int[] A = {1, 3, 6, 4, 1, 2};
        int[] B = {1, -2, 3,4,5};
        int[] C = {-1, -3};

        int k = SolutionL4d.solution(B);
        System.out.println(k);
    }
}

class SolutionL4d {
    public static int solution(int[] A) {
        Arrays.sort(A);
        int min = 1;
        /** for efficiency — no need to calculate or access the
         array object’s length property per iteration
         */
       //comparing each value in the Array
        for (int j : A) {
            if (j == min) {
                min++;
            }
        }
        return min;

    }
}



