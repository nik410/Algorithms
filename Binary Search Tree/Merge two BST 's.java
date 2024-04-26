/*
class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}
    
*/
class Solution
{
    //Function to return a list of integers denoting the node 
    //values of both the BST in a sorted order.
    
    public static void inOrder(Node root, ArrayList<Integer> al){
        
        if(root == null)return;
        
        inOrder(root.left, al);
        al.add(root.data);
        inOrder(root.right, al);
        
    }
    
    public List<Integer> merge(Node root1,Node root2)
    {
       // Recursive Inorder way
       // ArrayList<Integer> al1 = new ArrayList();
       // ArrayList<Integer> al2 = new ArrayList();
       
       // inOrder(root1, al1);
       // inOrder(root2, al2);
       // List<Integer> ans = new ArrayList();
       // int i, j;
       // for(i = 0, j = 0 ; i < al1.size() && j < al2.size();){
       //     if(al1.get(i) >= al2.get(j)){
       //         ans.add(al2.get(j));
       //         j++;
       //     }
       //     else{
       //          ans.add(al1.get(i));
       //          i++;
       //     }
       // }
       
       // while( i < al1.size()){
       //     ans.add(al1.get(i));
       //      i++;
       // }
       
       //  while( j < al2.size()){
       //     ans.add(al2.get(j));
       //      j++;
       // }
       
       // return ans;
    }
}
