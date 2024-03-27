import java.util.*;
import java.io.*;

public class Solution{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        Stack<Integer> st = new Stack();
        ArrayList<Integer> ans = new ArrayList();
        ans.ensureCapacity(n);
        int in = n;
        while(in-- > 0)ans.add(-1);

        // for(int i =0; i < n; i++){
        //     while(!st.isEmpty() && arr.get(st.peek()) > arr.get(i) ){
        //         ans.set(st.peek(), arr.get(i));
        //         st.pop();
        //     }
        //     st.push(i);
        //     //System.out.println(st);
        // }


        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() >= arr.get(i)){
                st.pop();
            }
            if(st.isEmpty())ans.set(i, -1 );
            else{
                    ans.set(i, st.peek());
            }
            st.push(arr.get(i));
        }

        return ans;
    }
}
