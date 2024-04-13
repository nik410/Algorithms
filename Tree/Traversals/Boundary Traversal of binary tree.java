// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

class Solution
{
    static void leftSub(Node root, ArrayList<Integer> al){
        
        if(root == null)return;
        if(root.left == null && root.right == null)return;
        
        al.add(root.data);
        if(root.left != null)
        leftSub(root.left, al);
        else
        leftSub(root.right, al);
    }
    
    static void leaf(Node root, ArrayList<Integer> al){
        if(root == null)return;
        
        if(root.left == null && root.right == null){
            al.add(root.data);
            return;
        }
        leaf(root.left, al);
        leaf(root.right, al);
    }
    
    static void rightSub(Node root, ArrayList<Integer> al){
        
        if(root == null)return;
        if(root.left == null && root.right == null)return;
         
         
        if(root.right != null){
         rightSub(root.right, al);
        }
        else 
        rightSub(root.left, al);
         
         al.add(root.data);
         
    }
    
	ArrayList <Integer> boundary(Node node)
	{
	    ArrayList<Integer> al = new ArrayList();
	    //root
	    al.add(node.data);
	    
	    if(node.right == null && node.left == null)return al;
	    //Left
	    leftSub(node.left, al);
	    
	    //Leaf Node
	    leaf(node, al);
	    
	    //Right
	    rightSub(node.right, al);
	    
	    return al;
	}
}
