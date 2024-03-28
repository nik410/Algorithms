class Solution {
    public int largestRectangleArea(int[] heights) {
        int l = heights.length;
        int smallR[] = new int[l];
        int smallL[] = new int[l];
        Arrays.fill(smallR, l);
        Arrays.fill(smallL, -1);
        Stack<Integer> st = new Stack();

        for(int i = 0; i < l; i++){
            while(!st.isEmpty() && heights[st.peek()] > heights[i]){
                smallR[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        st = new Stack();
         for(int i = l - 1; i >= 0; i--){
            while(!st.isEmpty() && heights[st.peek()] > heights[i]){
                smallL[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        
        
        // System.out.print("Small R: ");
        // for(int i : smallR){
        //     System.out.print(i +" ");
        // }
        // System.out.println("Small L: ");
        // for(int i : smallL){
        //     System.out.print(i +" ");
        // }
        int ans[] = new int[l];
        int maxArea = 0;
        for(int i = 0; i < l; i++){
            ans[i] = smallR[i] - smallL[i] - 1; 
            maxArea = Math.max(maxArea, ans[i] * heights[i]);
        }

        // for(int i : ans){
        //     System.out.print(i +" ");
        // }

        return maxArea;

    }
}
