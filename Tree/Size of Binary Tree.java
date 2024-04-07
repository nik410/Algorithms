class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static int getSize(Node node) {
        if(node == null){
            return 0;
        }
        
        return 1 + getSize(node.left) + getSize(node.right);
    }
}
        
