package com.codility;

public class L4aFrogRiverOne {
    public static void main(String[] args) {
        // write your code here
        int[] A = {1,2,3,4,3,3,5,1}; // filling position each second
//second->       //0,1,2,3,4,5,6,7  time domain
        int X = 5; //X is the num. of position to b filled
        int k = SolutionL4a.solution(X,A);
        System.out.println(k);
    }
}

class SolutionL4a {
    public static int solution(int X, int[] A) {
        // write your code in Java SE 11
                    int steps = X; //X is the num. of positions to b filled
            boolean[] bitmap = new boolean[steps+1];
            for(int i = 0; i < A.length; i++){
                if(bitmap[A[i]]==false){
                    bitmap[A[i]] = true;
                                        steps--;
                    if(steps == 0) return i;
                }

            }
            return -1 ;

    }
}
