

class GetMin
{   
    static Stack<Integer> st = new Stack();
    //Function to push all the elements into the stack.
    public static Stack<Integer> _push(int arr[],int n)
    {
        
       
            for(int i = 0; i < n; i++){
                if(!st.isEmpty() &&st.peek() < arr[i]){
                    int peekV = st.peek();
                    st.push(peekV);
                }
                else{
                    st.push(arr[i]);
                }
            }
        
        
        return st;
    }
    
    //Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer>s)
    {
       while(!st.isEmpty()){
           System.out.print(st.pop() + " ");
       }
    }
}
