
class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        //If we look past all the masks, we see that this problem is similar to nearest
        //greatest in left
        
        Stack<Integer> st = new Stack();
        int ans[]= new int[n];
        Arrays.fill(ans, 1);
        
        for(int i = n - 1; i >= 0; i --){
            
            while(!st.isEmpty() && price[st.peek()] < price[i]){
                
                ans[st.peek()] = st.peek() - i;
                st.pop();
                
            }
            
            st.push(i);
            
        }
        
        while(!st.isEmpty()){
            ans[st.peek()] = st.pop() + 1; 
        }
        
        return ans;
            
    }
    
}
