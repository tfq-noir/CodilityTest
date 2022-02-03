package com.codility;
import java.util.Arrays;
/**
 * This is a demo task.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 *
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 *
 * Given A = [1, 2, 3], the function should return 4.
 *
 * Given A = [−1, −3], the function should return 1.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 **/

public class SmallestPositiveInteger {
    public static void main(String[] args) {
	// write your code here
        int[] A ={-1, -3};
       int i = Solution.solution(A);
        System.out.println (i);
    }
}


class Solution {
    public static int solution(int[] arr) {
        int smallestInt = 1;
        Arrays.sort(arr);
        if (arr.length == 0) return smallestInt; // 1st condition: if no element in the array
        if (arr[0] > 1) return smallestInt; // 2nd condition: if 1 is not present
        if (arr[arr.length - 1] <= 0) return smallestInt; // 3rd condition: array with negative values

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == smallestInt) {
                smallestInt++;
            }
        }
        return smallestInt;
    }
}