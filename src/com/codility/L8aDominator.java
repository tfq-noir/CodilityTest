package com.codility;
import java.util.*;

public class L8aDominator {
    public static void main(String[] args) {
        int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
        int i = SolutionL8a.solution(A);
        System.out.println ((i));
    }
}

class SolutionL8a {
    public static int solution(int[] A) {

        // Using "hashMap" for counting
        Map<Integer, Integer> map = new HashMap<>();

        // 1. Counting
        // map(key, value) ---> map(number, count)
        for(int i=0; i<A.length; i++){
            if( !map.containsKey(A[i]) ){ // new number
                map.put(A[i],1);          // "put" new number
            }
            else{
                int count = map.get(A[i]); // "get" count
                map.put(A[i], count+1);    // count++ increasing the counting by 1
            }
        }

        // 2. find the max number of counts
        int max_Number =0;
        int max_Count =0;
        // note: use "map.keySet()" in for loop
        for( int key: map.keySet() ){
            int cur_Count = map.get(key); // get value
            if( cur_Count > max_Count){
                max_Count = cur_Count;    // update max count
                max_Number = key;
            }
        }

        // 3. check if there is a "dominator" or not
        if( max_Count > (A.length)/2 ){
            // then, max_Number is the "dominator"
        }
        else{
            return -1; // no dominator
        }

        // 4. return "any index" of "the dominator"
        for(int i=0; i<A.length; i++){
            if(A[i] == max_Number){
                return i; // return the index
            }
        }

        return -1;
    }
}

class SolutionL8a1 {
    public static int solution(int[] A) {
        Map<Integer, Integer> D = new HashMap<Integer, Integer>();
        for (int a : A) {
            if (D.containsKey(a)) { //boolean
                D.put(a, D.get(a) + 1);
            } else {
                D.put(a, 1);
            }
        }
        int n = A.length;
        for (Map.Entry<Integer, Integer> d : D.entrySet()) {
            if (d.getValue() > n / 2) {
                for (int i = 0; i < n; i++) {
                    if (A[i] == d.getKey()) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
