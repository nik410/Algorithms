class Solution {
    static int[] nextGreaterElement(int N, int arr[]) {
        Stack<Integer> st = new Stack();
        int ans[] = new int[N];
        Arrays.fill(ans, -1);
        
        for(int i = 0; i < 2 * N; i++){
            
            while(!st.isEmpty() && arr[st.peek() % N] < arr[i % N]){
                ans[st.peek() % N] = arr[i % N];
                st.pop();
            }
            st.push(i);
        }
        
        return ans;
    }
}
