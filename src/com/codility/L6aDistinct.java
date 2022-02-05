package com.codility;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class L6aDistinct {
    public static void main(String[] args) {
        // write your code here
        int[] A = {2,1,1,2,3,1};

        int i = SolutionL6a.solution(A);
        System.out.println ((i));
    }
}


class SolutionL6a {
    public static int solution(int[] A) {
        Set<Integer> store = new HashSet<>();
        for (int a : A) {
            store.add(a);
        }

        return store.size();
    }
}
