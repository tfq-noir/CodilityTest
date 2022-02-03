package com.codility;

public class L1BinaryGap {
    public static void main(String[] args) {
        // write your code here
        int A =328 ;

        int i = SolutionT1.solution(A);
        System.out.println (i);
    }
}
class SolutionT1 {
//    public static int solution(int num) {
//        int ptr; //Used for bitwise operation.
//        for(ptr=1; ptr>0; ptr = ptr<<1) //Find the lowest bit 1
//            if((num&ptr) != 0)
//                break;
//        int cnt=0; //Count the (possible) gap
//        int ret=0; //Keep the longest gap.
//        for(; ptr>0; ptr<<=1) {
//            if((num&ptr) != 0) { //If it's bit 1
//                ret = cnt < ret ? ret : cnt; //Get the bigger one between cnt and ret
//                cnt=-1; //Exclude this bit
//            }
//            cnt++; //Increment the count. If this bit is 1, then cnt would become 0 beause we set the cnt as -1 instead of 0.
//        }
//        return ret;
//    }

    public static int solution(int n) {
        int r = 0;
        int t = 0;
        String S = Integer.toBinaryString(n);
        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            if (s == '1') {
                if (t > r) {
                    r = t;
                }
                t = 0;
            } else {
                t++;
            }
        }
        return r;
    }

}