import java.util.*;
public class Solution {
    public static int[] nextGreaterElement(int[] arr, int n) {
       Stack<Integer> st = new Stack();
       int ans[] = new int[n];

       //One approach starting from the last index

    //    for(int i = n - 1; i >=0; i--){
          
    //            while(!st.isEmpty() && st.peek() <= arr[i]){
    //                st.pop();
    //            }
    //            if(st.size() == 0)ans[i] = -1;
    //            else{
    //                ans[i] = st.peek();
    //            }
    //            st.push(arr[i]);
                      
    //    }

        //Second Approach is to start from first index but store the indexes instead of values
        Arrays.fill(ans, -1);

        for(int i = 0; i < n; i++){

            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                ans[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }  
       return ans;
    }
}
