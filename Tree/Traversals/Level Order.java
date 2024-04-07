/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node root) 
    {
        Queue<Node> q = new LinkedList();
        ArrayList<Integer> ans = new ArrayList();
        q.offer(root);
        
        while(!q.isEmpty()){
            
            //Left
            if(q.peek().left != null)
            q.offer(q.peek().left);
            
            //Right
            if(q.peek().right != null)
            q.offer(q.peek().right);
            
            ans.add(q.poll().data);
        }
        
        return ans;
    }
}





