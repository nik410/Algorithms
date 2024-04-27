class Solution
{
    //Function to find the nodes that are common in both BST.
	public static ArrayList<Integer> findCommon(Node root1,Node root2)
    {
        Stack<Node> st1 = new Stack();
        Stack<Node> st2 = new Stack();
        ArrayList<Integer> ans = new ArrayList();
        
        while(root1 != null){
            st1.push(root1);
            root1 = root1.left;
        }
        
         while(root2 != null){
            st2.push(root2);
            root2 = root2.left;
        }
        
        
        while(!st1.isEmpty() && !st2.isEmpty()){
            //Top Element equal
            if(st1.peek().data == st2.peek().data){
                ans.add(st1.peek().data);
                root1 = st1.peek().right;
                st1.pop();
                root2 = st2.peek().right;
                st2.pop();
            }
            //s1 > s2
            else if(st1.peek().data > st2.peek().data){
                 root2 = st2.peek().right;
                st2.pop();
            }
            //s2 > s1
            else{
                 root1 = st1.peek().right;
                st1.pop();
            }
            
            
            
        while(root1 != null){
            st1.push(root1);
            root1 = root1.left;
        }
        
         while(root2 != null){
            st2.push(root2);
            root2 = root2.left;
        }
        }
        
        return ans;
        
    }
}
