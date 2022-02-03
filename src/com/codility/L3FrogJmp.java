package com.codility;

import java.util.Arrays;

public class L3FrogJmp {
    public static void main(String[] args) {
        // write your code here
        int X = 10;
        int Y = 101;
        int D = 30;
        System.out.println(SolutionL3.solution(X,Y,D));
    }
}
class SolutionL3 {
    public static int solution(int X, int Y, int D) {
      int  result =  (int) Math.ceil((double) (Y - X) / (double) D);
        return result;
    }
}