package com.codility;
import java.util.Stack;
public class L7bFish {
    public static void main(String[] args) {
        // write your code here
        int[] A = {4,3,2,1,5};
        int[] B = {0,1,0,0,0};

        int i = SolutionL7b1.solution(A, B);
        System.out.println ((i));
    }
}

class SolutionL7b1 {
    public static int solution(int[] A, int[] B) {

        // special case: no fish
        if(A.length == 0)
            return 0;

        // main idea: use "stack" to store the fishes with B[i]==1
        // that is, "push" the downstream fishes into "stack"
        // note: "push" the Size of the downstream fish
        Stack<Integer> st = new Stack<>();
        int numAlive = A.length;

        for(int i=0; i<A.length; i++){

            // case 1; for the fish going to downstream
            // push the fish to "stack", so we can keep them from the "last" one
            if(B[i] ==1){
                st.push(A[i]); // push the size of the downstream fish
            }
            // case 2: for the fish going upstream
            // check if there is any fish going to downstream
            if(B[i] ==0){
                while( !st.isEmpty() ){
                    // if the downstream fish is bigger (eat the upstream fish)
                    if( st.peek() > A[i] ){
                        numAlive--;
                        break;      // the upstream fish is eaten (ending)
                    }
                    // if the downstream fish is smaller (eat the downstream fish)
                    else if(st.peek() < A[i]){
                        numAlive--;
                        st.pop();   // the downstream fish is eaten (not ending)
                    }
                }
            }
        }

        return numAlive;
    }
}

//class SolutionL7b {
//    public static int solution(int[] A, int[] B) {
//        int r = 0;
//        Stack<Integer> T = new Stack<Integer>();
//        int n = A.length;
//        for (int i = 0; i < n; i++) {
//            if (B[i] == 0) {
//                while (T.size() > 0 && A[i] > T.peek()) {
//                    T.pop();
//                }
//                if (T.size() == 0) {
//                    r++;
//                }
//            } else {
//                T.push(A[i]);
//            }
//        }
//        return r + T.size();
//    }
//}

