/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static class Pair{
        Node node;
        int x_axis;
        
        Pair(Node node, int x_axis){
            this.node = node;
            this.x_axis = x_axis;
        }
    }
    
    static ArrayList<Integer> topView(Node root)
    {
        ArrayList<Integer> ans = new ArrayList();
        TreeMap<Integer, Node> tm = new TreeMap();
        Queue<Pair> q = new LinkedList();
        q.offer(new Pair(root, 0));
        tm.put(0, root);
        while(!q.isEmpty()){
            int siz = q.size();
            
            for(int i = 0; i < siz; i++){
                Pair temp = q.peek();
                if(temp.node.left != null){
                    q.offer(new Pair(temp.node.left, temp.x_axis - 1));
                    if(!tm.containsKey(temp.x_axis - 1)){
                        tm.put(temp.x_axis - 1, temp.node.left);
                    }
                }
                
                if(temp.node.right != null){
                    q.offer(new Pair(temp.node.right, temp.x_axis + 1));
                    if(!tm.containsKey(temp.x_axis + 1)){
                        tm.put(temp.x_axis + 1, temp.node.right);
                    }
                }
                
                q.poll();
            }
        }
        
        for(int i: tm.keySet()){
            ans.add(tm.get(i).data);
        }
        
        return ans;
        
    }
}
