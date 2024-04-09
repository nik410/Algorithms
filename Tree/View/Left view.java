
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    void leftViewUsingRe(Node root, int level, ArrayList<Integer> ans){
        if(root == null)return;
        
        if(level == ans.size())ans.add(root.data);
        
        leftViewUsingRe(root.left, level + 1, ans);
        leftViewUsingRe(root.right, level + 1, ans);
        
    }
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      ArrayList<Integer> ans = new ArrayList();
      leftViewUsingRe(root, 0, ans);
      return ans;
      
      
    //   if(root == null)return ans;
    //   Queue<Node> q = new LinkedList();
      
    //   q.offer(root);
    //   //ans.add(root.data);
      
    //   while(!q.isEmpty()){
    //       int siz = q.size();
          
    //       //int leftV =-1, flag = 0;
    //       ans.add(q.peek().data);
          
    //       for(int i = 0; i < siz; i++){
    //           Node temp = q.peek();
              
    //           if(temp.left != null){
    //               q.add(temp.left);
    //             //   if(flag == 0){
    //             //       leftV = temp.left.data;
    //             //       flag = 1;
    //             //   }
    //           }
              
    //           if(temp.right != null){
    //               q.add(temp.right);
    //             //   if(flag == 0){
    //             //       leftV = temp.right.data;
    //             //       flag = 1;
    //             //   }
    //           }
    //           q.poll();
    //       }
          
    //       //if(leftV != -1)
         
    //   }
      
      
    //   return ans;
      
    }
}
