package com.codility;

public class L5aPassingCars {
    public static void main(String[] args) {
        // write your code here
        int[] A = {0, 1, 0, 1, 1};
        int k = SolutionL5a.solution(A);
        System.out.println(k);
    }
}

class SolutionL5a {
        public static int solution(int[] A) {
            int eastBoundCarsSeen = 0;
            int passingCars = 0;
            for (int a : A) {
                if (a == 0) {
                    eastBoundCarsSeen++;
                } else {
                    passingCars += eastBoundCarsSeen;
                    if (passingCars > 1000000000) {
                        return -1;
                    }
                }
            }
            return passingCars;
        }
    }
