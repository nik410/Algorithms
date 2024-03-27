class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        List<Integer> ans = new ArrayList();
        for(int i = 0;i < n ; i++) ans.add(-1);
        
        Stack<Integer> st = new Stack();
        
        //One method - start from the 0 index
        
        // for(int i = 0; i < n; i++){
            
        //     while(!st.isEmpty() && st.peek() >= a[i]){
        //         st.pop();
        //     }
        //     if(st.size() >= 1)ans.set(i, st.peek());
            
        //     st.push(a[i]);
        // }
        
        //Second method to start from end n - 1 index
        
        for(int i = n - 1; i >= 0; i --){
            
            
            while(!st.isEmpty() && a[st.peek()] > a[i]){
                ans.set(st.peek(), a[i]);
                st.pop();
            }
            
            st.push(i);
        }
        
        return ans;
    }
}
